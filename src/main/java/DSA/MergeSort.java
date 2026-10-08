package DSA;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={5,4,2,6,7,2,1,3};

        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void mergeSort(int[] arr, int left, int right) {
        if(left<right)
        {
            int mid=(left+right)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {

        int i=left;
        int j=mid+1;
        int k=left;
        int newarr[]=new int[arr.length];

            while(i<=mid && j<=right)
            {
                if(arr[i]<=arr[j])
                    newarr[k++]=arr[i++];

                else
                    newarr[k++]=arr[j++];


            }

            if(i>mid)
            {
                for( int z=j;z<=right;z++)
                    newarr[k++]=arr[z];

            }
            if(j>right)
            {
                for(int z=i;z<=mid;z++)
                    newarr[k++]=arr[z];
            }

            for(int b=left;b<=right;b++)
            {
                arr[b]=newarr[b];
            }

    }
}
