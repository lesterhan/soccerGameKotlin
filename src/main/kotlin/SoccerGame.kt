class SoccerGame {
    val fans = mutableListOf<Fan>()
    var teamsMap = mutableMapOf<Team, Int>()

    fun addFan(fan: Fan) {
        fans.add(fan)
    }

    fun addTeam(team: Team) {
        teamsMap.putIfAbsent(team,0)
    }

    fun scoreByTeam(scoringTeam: Team) {
        fans.forEach {
            it.reactToScore(scoringTeam)
        }
    }
}
