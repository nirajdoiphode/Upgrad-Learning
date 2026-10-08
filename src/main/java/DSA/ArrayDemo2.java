package DSA;

import java.util.Scanner;

// Collect the sales data of a shop of last n days and store it in array,
// then use this data to check weather the owner has achived his target or not
// e.g data= 10 20 30 40 50 ( total=150)  .
// let target 1= 100 , the output be like : he as achive his 1st target on 4 day


public class ArrayDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;
        int sales[] = new int[n];
        System.out.println(" Enter the sales of last " + n + " days");

        for (int i = 0; i < n; i++) {
            sales[i] = sc.nextInt();
        }
        System.out.println("Record saved..");

//        for (int i = 0; i < 3; i++) {
//            System.out.println("Enter " + (i + 1) + " target: ");
//            int target = sc.nextInt();
//            int sum = 0;
//            boolean flag = true;
//
//            System.out.println("sum : " + sum);
//            for (int j = 0; j < sales.length; j++) {
//                sum += sales[j];
//
//                if (sum >= target) {
//                    System.out.println("target " + (j + 1) + " achived on day: " + (j + 1));
//                    flag = false;
//                    break;
//                }
//
//            }
//
//            if (flag == true) {
//                System.out.println("Target not achived yet...!");
//            }
//            System.out.println("sum: " + sum);



        int sum=0;
        int storeIteration=0;

        for(int i=0;i<3;i++)
        {
            System.out.println("Enter you "+(i+1)+" target: ");
            int target = sc.nextInt();
            boolean flag=true;
            for(int j=storeIteration;j< sales.length;j++)
            {
                sum+=sales[j];
                if(sum>=target)
                {
                    System.out.println("target " + (j + 1) + " achived on day: " + (j + 1));
                    sum-=target;
                    storeIteration=j+1;
                    flag=false;
                    System.out.println("Current sum value: "+sum);
                    break;
                }

              //  System.out.println("Current sum value: "+sum);
            }
            if(flag==true)
            {
                System.out.println("TARGET NOT ACHIVED....");
            }

        }
    }
}
