import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.shouldBe
import io.mockk.mockk
import io.mockk.verify

class SoccerGameTest : StringSpec({
    "a new soccer game has no fans" {
        val soccerGame = SoccerGame()
        soccerGame.fans.size shouldBe 0
    }

    "soccer game can add fans" {
        val soccerGame = SoccerGame()
        val fan = Fan(Team.NYRedBulls)
        soccerGame.addFan(fan)
        soccerGame.fans shouldContain fan
    }

    "a new soccer game has no teams" {
        val soccerGame = SoccerGame()
        soccerGame.teamsMap.size shouldBe 0
    }

    "soccer game can add team" {
        val soccerGame = SoccerGame()
        val team = Team.NYRedBulls
        soccerGame.addTeam(team)
        soccerGame.teamsMap.keys shouldContain team
    }

    "scoring will make all fans react" {
        val soccerGame = SoccerGame()
        val fan1 = mockk<Fan>(relaxed = true)
        val fan2 = mockk<Fan>(relaxed = true)
        soccerGame.addFan(fan1)
        soccerGame.addFan(fan2)
        soccerGame.scoreByTeam(Team.TorontoFC)
        verify {
            fan1.reactToScore(Team.TorontoFC)
            fan2.reactToScore(Team.TorontoFC)
        }
    }
})
