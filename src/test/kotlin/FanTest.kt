import Team.*
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class FanTest: StringSpec ({
    "Fan should return YAY when preferred team scores" {
        Fan(NYRedBulls).reactToScore(Team.NYRedBulls) shouldBe "YAY!"
    }

    "Fan should return BOO when the other team scores" {
        Fan(NYRedBulls).reactToScore(Team.TorontoFC) shouldBe "Booo!"
    }
})
