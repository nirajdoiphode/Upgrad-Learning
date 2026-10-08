package practiceAssignment.demoAssignment;

public class iplPlayers {
    private String name;
    private int matchesPlayed;
    private int runScored;

    public iplPlayers(String name, int matchesPlayed, int runScored) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.runScored = runScored;
    }
    public iplPlayers() {}

    @Override
    public String toString() {
        return "iplPlayers{" +
                "name='" + name + '\'' +
                ", matchesPlayed=" + matchesPlayed +
                ", runScored=" + runScored +
                '}'+"\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
