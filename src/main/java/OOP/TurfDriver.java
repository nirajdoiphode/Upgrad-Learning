package OOP;

import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.setOut;

public class TurfDriver implements Turf {
    String name;
    String date;
    String time;
    String ground;
    int hours;
    int rate;

    Scanner sc=new Scanner(System.in);
    @Override
    public void getInputs() {
        System.out.println("Enter your name: ");
        name=sc.next();
        System.out.println("Enter your date: ");
        date=sc.next();
        System.out.println("Enter your time: ");
        time=sc.next();
        System.out.println("Enter your ground: ");
        ground=sc.next();
        System.out.println("Enter your hours: ");
        hours=sc.nextInt();

        if(ground.equalsIgnoreCase("Cricket")){
            rate=700;
        }
        else if(ground.equalsIgnoreCase("Football")){
            rate=1000;
        }
        else{
            System.out.println("Invalid input");
            exit(0);
        }
    }

    @Override
    public int calculate() {
        return rate*hours;
    }

    @Override
    public void displayBill() {

        System.out.println("***************************************");

        System.out.println(String.format("%10s","name",name));
        System.out.println("Date: "+date);
        System.out.println("Time: "+time);
        System.out.println("Ground: "+ground);
        System.out.println("Hours: "+hours);
        System.out.println("Total : "+calculate());
        System.out.println("***************************************");;

    }


    public static void main(String[] args) {
        TurfDriver td=new TurfDriver();
        td.getInputs();
        td.displayBill();
    }
}
