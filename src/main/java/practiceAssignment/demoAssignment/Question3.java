package practiceAssignment.demoAssignment;

import java.util.ArrayList;
import java.util.List;

public class Question3 {
    public static void main(String[] args) {
        List<intPlayers> india=new ArrayList();
        india.add(new intPlayers("Virat",10,54,"India"));
        india.add(new intPlayers("Rohit",15,75,"India"));
        india.add(new intPlayers("Dhoni",20,124,"India"));


        List<intPlayers> australia=new ArrayList();
        australia.add(new intPlayers("Smith",7,104,"Australia"));
        australia.add(new intPlayers("Travis",3,22,"Australia"));
        australia.add(new intPlayers("cummins",25,20,"Australia"));

        List<intPlayers> england=new ArrayList();
        england.add(new intPlayers("Joe",7,104,"Australia"));
        england.add(new intPlayers("Ben",3,22,"Australia"));
        england.add(new intPlayers("Mark",25,20,"Australia"));



        ArrayList<List<intPlayers>> list=new ArrayList();
        list.add(india);
        list.add(australia);
        list.add(england);

        int count=0;
        for(List<intPlayers> l:list){
            System.out.println(l.toString());
            count+=l.size();

        }
        System.out.println("Total Players Count: "+count);
    }
}
