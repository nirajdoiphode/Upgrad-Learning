package collection_frmwk;

public class Player {
    private int pid;
    private String name;
    private int matchPlayed;
    private int runScored;
    private int cathesTaken;
    private int wicketTaken;
    private int tropiesWin;
    private String country;

    public Player(int pid, String name, int matchPlayed, int runScored, int cathesTaken, int wicketTaken, int tropiesWin, String country) {
        this.pid = pid;
        this.name = name;
        this.matchPlayed = matchPlayed;
        this.runScored = runScored;
        this.cathesTaken = cathesTaken;
        this.wicketTaken = wicketTaken;
        this.tropiesWin = tropiesWin;
        this.country = country;
    }

    public Player() {
        this.pid = 999;
        this.name = "Sumedh";
        this.matchPlayed = 12;
        this.runScored = 144;
        this.cathesTaken = 15;
        this.wicketTaken = 3;
        this.tropiesWin = 3;
        this.country = "India";
    }

    @Override
    public String toString() {
        return "Player{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", matchPlayed=" + matchPlayed +
                ", runScored=" + runScored +
                ", cathesTaken=" + cathesTaken +
                ", wicketTaken=" + wicketTaken +
                ", tropiesWin=" + tropiesWin +
                ", country='" + country + '\'' +
                '}';
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatchPlayed() {
        return matchPlayed;
    }

    public void setMatchPlayed(int matchPlayed) {
        this.matchPlayed = matchPlayed;
    }

    public int getRunScored() {
        return runScored;
    }

    public void setRunScored(int runScored) {
        this.runScored = runScored;
    }

    public int getCathesTaken() {
        return cathesTaken;
    }

    public void setCathesTaken(int cathesTaken) {
        this.cathesTaken = cathesTaken;
    }

    public int getWicketTaken() {
        return wicketTaken;
    }

    public void setWicketTaken(int wicketTaken) {
        this.wicketTaken = wicketTaken;
    }

    public int getTropiesWin() {
        return tropiesWin;
    }

    public void setTropiesWin(int tropiesWin) {
        this.tropiesWin = tropiesWin;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
