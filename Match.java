/**
 * Class Match represent the results of a soccer match.
 * 
 */
class Match {

    private String date;

    private String teamA;
    private String teamB;

    private int goalsA;
    private int goalsB;

    /**
     * Create a 
     * @param date
     * @param teamA
     * @param goalsA
     * @param teamB
     * @param goalsB
     */
    public Match(String date, String teamA, int goalsA, String teamB, int goalsB) {
        // TODO: check for null
        // TODO: check for negative numbers        
        this.date = date;

        this.teamA = teamA;
        this.teamB = teamB;

        this.goalsA = goalsA;
        this.goalsB = goalsB;
    }

    /**
     * 
     */
    @Override
    public String toString() {
        return String.format("%s %s %d x %s %d", date, teamA, goalsA, teamB, goalsB);
    }

}