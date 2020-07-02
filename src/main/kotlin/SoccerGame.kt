class SoccerGame {
    val fans = mutableListOf<Fan>()
    var teamsMap: Map<Team, Int> = mutableMapOf(
        Team.NYRedBulls to 0,
        Team.TorontoFC to 0
    )

    fun addFan(fan: Fan) {
        fans.add(fan)
    }

    fun scoreByTeam(scoringTeam: Team) {
        fans.forEach {
            it.reactToScore(scoringTeam)
        }
    }
}
