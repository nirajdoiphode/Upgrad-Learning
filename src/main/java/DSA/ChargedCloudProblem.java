package DSA;

public class ChargedCloudProblem {
    public static void main(String[] args) {
        int arr[]={0,0,1,0,0,1,0,0};
        int pos=0;
        int jumpCount=0;

        while(pos<arr.length-1){
            if((pos+2)<=arr.length-1 && arr[pos+2]==0)
                pos += 2;

            else
                pos+=1;

            jumpCount++;

        }

        System.out.println("jump count: "+jumpCount);
       // System.out.println("Positions: "+pos);
    }
}
