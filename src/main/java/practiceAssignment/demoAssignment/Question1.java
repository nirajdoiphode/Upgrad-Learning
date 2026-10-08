package practiceAssignment.demoAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        int choice=1;
        List<Players> plist=new ArrayList();
        do {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Name:");
            String name=sc.next();
            System.out.println("Enter jersy No:");
            int jno=sc.nextInt();
            System.out.println("Enter Total no of Matches Played:");
            int matchesPlayed=sc.nextInt();
            System.out.println("Enter Total Runs Scored :");
            int score=sc.nextInt();

            plist.add(new Players(name, jno,matchesPlayed,score));

            System.out.println("===========================================");
            System.out.println("DO YOU WANT TO CONTINUE [0= YES / 1 =NO]:  ");
            System.out.println("===========================================");
            choice=sc.nextInt();
        }
        while (choice==0);

        System.out.println(plist.toString());

    }
}
