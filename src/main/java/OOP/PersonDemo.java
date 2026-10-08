package OOP;

import java.util.Scanner;

public class PersonDemo {
    protected String name;
    protected int age;
    protected String city;

    public void acceptDetails() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        name=sc.next();
        System.out.println("Enter your age");
        age=sc.nextInt();
        System.out.println("Enter your city");
        city=sc.next();
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
}
