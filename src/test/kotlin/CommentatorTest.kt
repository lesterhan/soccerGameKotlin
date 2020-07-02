import Team.*
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class CommentatorTest: StringSpec ({
    "Commentator should return NY Redbulls and score" {
        Commentator().reactToScore(Team.NYRedBulls) shouldBe "New York Red Bulls SCORE!"
    }
})
