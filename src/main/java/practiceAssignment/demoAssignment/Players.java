package practiceAssignment.demoAssignment;

public class Players {                  //que 1
    private String name;
    private int jersyNo;
    private int matchesPlayed;
    private int runScored;

    public Players(String name, int jersyNo, int matchesPlayed, int runScored) {
        this.name = name;
        this.jersyNo = jersyNo;
        this.matchesPlayed = matchesPlayed;
        this.runScored = runScored;
    }
    public Players() { }

    @Override
    public String toString() {
        return "Players{" +
                "name=" + name +
                ", jersyNo=" + jersyNo +
                ", matchesPlayed=" + matchesPlayed +
                ", runScored=" + runScored +
                '}' + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJersyNo() {
        return jersyNo;
    }

    public void setJersyNo(int jersyNo) {
        this.jersyNo = jersyNo;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getRunScored() {
        return runScored;
    }

    public void setRunScored(int runScored) {
        this.runScored = runScored;
    }
}
