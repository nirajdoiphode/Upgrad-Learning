package practiceAssignment.demoAssignment;

import java.util.ArrayList;
import java.util.List;

public class Question2 {
    public static void main(String[] args) {
        List<iplPlayers> mi=new ArrayList<iplPlayers>();
        mi.add(new iplPlayers("Niraj",10,1024));
        mi.add(new iplPlayers("Karan",3,20));
        mi.add(new iplPlayers("Raj",5,35));

        List<iplPlayers> csk=new ArrayList<iplPlayers>();
        csk.add(new iplPlayers("Raman",7,104));
        csk.add(new iplPlayers("Shivam",3,22));
        csk.add(new iplPlayers("Dhoni",25,2000));

        System.out.println(csk.toString());
        System.out.println(mi.toString());

        List<List<iplPlayers>> ipl=new ArrayList<>();
        ipl.add(mi);
        ipl.add(csk);

        System.out.println("IPL Players: ");
        System.out.println(ipl);
    }
}
