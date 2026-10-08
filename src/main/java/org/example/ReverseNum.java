package org.example;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int onum=n;
        int rev=0;

        while(n>0)
        {
            int lastdigit=n%10;
            rev= (rev*10)+lastdigit;
            n=n/10;
        }
        System.out.println("The reverse of "+onum+" is "+rev);

    }
}
