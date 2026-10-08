package collection_frmwk;

import java.util.ArrayList;

public class PlayerDriver {
    public static void main(String[] args) {

        ArrayList<Player> list = new ArrayList<>();

        list.add(new Player(101, "Virat Kohli", 275, 13000, 160, 4, 2, "India"));
        list.add(new Player(102, "Rohit Sharma", 265, 11000, 180, 8, 3, "India"));
        list.add(new Player(103, "Steve Smith", 220, 9500, 145, 5, 1, "Australia"));
        list.add(new Player(104, "Babar Azam", 250, 12500, 90, 0, 2, "Pakistan"));
        list.add(new Player(105, "Joe Root", 260, 12000, 125, 5, 1, "England"));
        list.add(new Player(106, "Kane Williamson", 230, 10500, 110, 2, 1, "New Zealand"));
        list.add(new Player(107, "David Warner", 250, 11500, 95, 0, 2, "Australia"));
        list.add(new Player(108, "Jasprit Bumrah", 180, 500, 70, 350, 1, "India"));
        list.add(new Player(109, "Ben Stokes", 210, 7000, 130, 180, 2, "England"));
        list.add(new Player(110, "Rashid Khan", 190, 2500, 85, 300, 3, "Afghanistan"));

        for(Player p : list){
            System.out.println(p);
        }


    }
}
