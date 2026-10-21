package tp;

import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {    //Next warmer day
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of days: ");
        int n=sc.nextInt();

        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=sc.nextInt();
        }
        int ans[]=new int[temp.length];


        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (temp[j] > temp[i]) {
                    ans[i] = j - i;
                    break;
                }

            }
        }
                System.out.println(Arrays.toString(ans));

    }
}
