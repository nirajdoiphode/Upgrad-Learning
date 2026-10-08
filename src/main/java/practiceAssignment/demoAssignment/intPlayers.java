package practiceAssignment.demoAssignment;

public class intPlayers {

    private String name;
    private int yearofExp;
    private int matchesPlayed;
    private String country;

    public intPlayers(String name, int yearofExp, int matchesPlayed, String country) {
        this.name = name;
        this.yearofExp = yearofExp;
        this.matchesPlayed = matchesPlayed;
        this.country = country;
    }
    public intPlayers() { }

    @Override
    public String toString() {
        return "intPlayers{" +
                "name='" + name + '\'' +
                ", yearofExp=" + yearofExp + ", matchesPlayed=" + matchesPlayed + ", country='" + country + '\'' +
                '}'+"\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearofExp() {
        return yearofExp;
    }

    public void setYearofExp(int yearofExp) {
        this.yearofExp = yearofExp;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
