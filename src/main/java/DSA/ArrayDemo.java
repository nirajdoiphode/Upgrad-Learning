package DSA;

import java.util.Scanner;

// Get n mobile numbers form user.
// the extrat digits form each mobile number and check weather its odd or even
// if it has equal no of odd and even number print  "balanced"
// if it has more no of odd numberes then print " odd biased number" else print "even biaseed number"


public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=1;
        long mob[]=new long[n];

        System.out.println("Enter mobile numbers: ");
        for(int i=0;i<n;i++)
        {
            mob[i]=sc.nextLong();
        }

        System.out.println("\n Result: \n");
        for( int i=0;i<mob.length;i++)
        {
            long lastdigit=0;
            int count=0;

            long temp=mob[i];
            for(int j=0;j<10;j++)
            {
                lastdigit= temp%10;
                temp/=10;

                if(lastdigit%2!=0)
                {
                    count++;
                }
               // System.out.println(lastdigit);
            }

            if(count==5)
            {
                System.out.println(mob[i]+ ", it has 5 odd 5 even it is balanced number");
            }
            if(count>5)
            {
                System.out.println(mob[i]+", it has "+count+" odd "+(10-count)+" even it is odd biased number");
            }

            if(count<5)
            {
                System.out.println(mob[i]+", it has "+count+" odd "+(10-count)+" even it is even biased number");
            }
        }

    }
}
