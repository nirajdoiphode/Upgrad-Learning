package practiceAssignment.collectionDay1;

import com.fasterxml.jackson.databind.util.ISO8601Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Students> stdList = new ArrayList();
        int choice=0;
        do {

            System.out.println("Enter your name: ");
            String name = sc.next();

            System.out.println("Enter your Roll no : ");
            int rollno = sc.nextInt();

            System.out.println("Enter your Course : ");
            String course = sc.next();

            System.out.println("Enter your Marks : ");
            int marks = sc.nextInt();


            stdList.add(new Students(name,rollno,marks,course));
            System.out.println("Enter your Choice:[0-> Continue/ 1-> Exit] ");
            choice = sc.nextInt();
        }
        while (choice == 0);
        System.out.println(stdList.toString());
    }



}
