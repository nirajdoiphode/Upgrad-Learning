package DSA;

import java.util.Scanner;

public class MaxConsicativeSeq {
    public static void main(String[] args) {
        int arr[]={7,4,9,9,9,6,8,6,0,7};
//        int arr[]={8,4,4,6,9,9,2,4,0,5};

        int max=0;
        int index=-1;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Consecative Sequence: ");
        int window=sc.nextInt();
        for(int i=0;i<arr.length-window;i++){
//            if(((arr[i]==arr[i+1])|| (arr[i+1]==arr[i+2]) || (arr[i]==arr[i+2])))
//            {
//                continue;
//            }
            int sum=0;
            for(int j=i;j<(i+window);j++){
                 sum+=arr[j];
            }
            if(sum>max){
                max=sum;
                index=i;
            }
        }

        System.out.println("Max sum: "+max);
        System.out.println("Index: "+index);

    }
}
