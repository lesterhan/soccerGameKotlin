class Fan(val preferredTeam: Team) {
    fun reactToScore(scoringTeam: Team): String {
        return if(scoringTeam == preferredTeam) "YAY!" else "Booo!"
    }
}
