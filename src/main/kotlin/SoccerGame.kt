class SoccerGame {
    val fans = mutableListOf<Fan>()
    fun addFan(fan: Fan) {
        fans.add(fan)
    }

    fun scoreByTeam(scoringTeam: Team) {
        fans.forEach {
            it.reactToScore(scoringTeam)
        }
    }
}
