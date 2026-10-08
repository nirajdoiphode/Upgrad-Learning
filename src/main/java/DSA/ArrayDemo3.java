package DSA;

import java.util.Scanner;

//public class ArrayDemo3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter Amount : ");
//        int amount = sc.nextInt();
//
//        int notes[] = new int[6];
//        int currency[] = {500, 200, 100, 50, 20, 10};
//
//        for (int i = 0; i < currency.length; i++) {
//            if (amount <= 0) {
//                break;
//            }
//            notes[i] = amount / currency[i];
//            amount = amount % currency[i];
//        }
//
//        int sum = 0;
//        for (int i = 0; i < notes.length; i++) {
//            if (notes[i] != 0) {
//                System.out.println(currency[i] + " X " + notes[i]);
//                sum += notes[i];
//            }
//
//        }
//        System.out.println("total notes in wallet: " + sum);
//
//    }
//}


public class ArrayDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Amount : ");
        int amount = sc.nextInt();

        int[] currency = new int[6];

        currency[0] = amount / 500;
        amount = amount % 500;     //settel amount

        currency[1] = amount / 200;
        amount = amount % 200;         //settel amount

        currency[2] = amount / 100;
        amount = amount % 100;          //settel amount

        currency[3] = amount / 50;
        amount = amount % 50;           //settel amount

        currency[4] = amount / 20;
        amount = amount % 20;           //settel amount

        currency[5] = amount / 10;
        amount = amount % 10;           //settel amount


        System.out.println(" 500 X " + currency[0]);
        System.out.println(" 200 X " + currency[1]);
        System.out.println(" 100 X " + currency[2]);
        System.out.println(" 50 X " + currency[3]);
        System.out.println(" 20 X " + currency[4]);
        System.out.println(" 10 X " + currency[5]);

        int sum = 0;
        for (int x : currency) {
            sum += x;
        }

        System.out.println("Total Notes in wallet: " + sum);
        System.out.println("Available Change= " + amount);
    }
}


