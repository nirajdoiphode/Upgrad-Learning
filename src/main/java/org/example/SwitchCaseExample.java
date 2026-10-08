package org.example;

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {

        System.out.println("1. Burger");
        System.out.println("2. Sandwich");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:             //burger
                System.out.println("What kins of burger will you like to have");
                System.out.println("1. Cheese Burger");
                System.out.println("2. Veg Burger");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:         //cheese burger
                        System.out.println("Please enter the size of burger:");
                        System.out.println("1. Small");
                        System.out.println("2. large");
                        choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("your Cheese burger (Small) will be served soon... ");
                                break;

                            case 2:
                                System.out.println("your Cheese burger (Large) will be served soon... ");
                                break;
                        }
                        break;

                    case 2:         //veg burger
                        System.out.println("Please enter the size of burger:");
                        System.out.println("1. Small");
                        System.out.println("2. large");
                        choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("your veg burger (Small) will be served soon... ");
                                break;

                            case 2:
                                System.out.println("your veg burger (Large) will be served soon... ");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
                break;

            case 2:             //sandwich
                System.out.println("What kins of burger will you like to have");
                System.out.println("1. Cheese sandwich");
                System.out.println("2. Veg sandwich");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:         //cheese sandwich
                        System.out.println("Please enter the size of sandwich:");
                        System.out.println("1. Small");
                        System.out.println("2. large");
                        choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("your Cheese sandwich (Small) will be served soon... ");
                                break;

                            case 2:
                                System.out.println("your Cheese sandwich (Large) will be served soon... ");
                                break;
                        }
                        break;

                    case 2:         //veg sandwich
                        System.out.println("Please enter the size of sandwich:");
                        System.out.println("1. Small");
                        System.out.println("2. large");
                        choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("your veg sandwich (Small) will be served soon... ");
                                break;

                            case 2:
                                System.out.println("your veg sandwich (Large) will be served soon... ");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }


        }
    }
}
