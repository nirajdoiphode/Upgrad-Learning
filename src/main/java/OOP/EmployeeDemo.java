package OOP;

import java.util.Scanner;

public class EmployeeDemo extends PersonDemo{
    protected int empid;
    protected String designation;

    public void setDetails() {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your designation");
       designation=sc.nextLine();
       System.out.println("Enter your empid");
       empid=sc.nextInt();
    }
    public void showDetails() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + designation);
    }
}
