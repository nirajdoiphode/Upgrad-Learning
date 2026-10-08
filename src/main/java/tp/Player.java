package tp;

public class Player {
     String name;
     int runs;
    public Player(String name, int runs) {
        this.name = name;
        this.runs = runs;
    }
    public Player() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }
}
