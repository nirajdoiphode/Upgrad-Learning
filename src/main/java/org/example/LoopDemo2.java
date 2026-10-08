package org.example;

import java.util.Scanner;

public class LoopDemo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("\n\nEnter Principal Amount: ");
            double p=sc.nextDouble();

            System.out.println("Enter Rate of Intrest: ");
            double r=sc.nextDouble();

            System.out.println("Enter duration: ");
            double t=sc.nextDouble();


            double si=simpleInterest(p,r,t);
            System.out.println("Simple Intrest: "+si+"\n Total Amount: "+(si+p));


        }
    }

    public static double simpleInterest(double p,double r,double n)
    {
        double si=(p*r*n)/100;
        return si;
    }
}
