package org.example;

import java.util.Scanner;

public class IfElseDemo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your monthly salary: ");
        int salary=sc.nextInt();

        if(salary>=100000){
            System.out.println("Excellent ");
        }
        else if (salary>=75000) {
            System.out.println("Very Good");
        }
        else if (salary>=50000) {
            System.out.println("Good");
        }
        else if (salary>=25000) {
            System.out.println("Acceptable");
        }
        else{
            System.out.println("Low Salary..!");
        }

    }
}
