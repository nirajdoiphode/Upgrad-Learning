package org.example;

import java.util.Scanner;

public class LoopsDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Age: ");
            int age = sc.nextInt();

            if (age < 18 && age > 0) {
                System.out.println("Minor");
            } else if (age > 18 & age < 25) {
                System.out.println("Young adult");
            } else if (age > 25 & age < 75) {
                System.out.println("adult");
            } else if (age < 0 || age > 110) {
                System.out.println("Invalid age");

            } else {
                System.out.println("senior ");
            }
        }

    }


}
