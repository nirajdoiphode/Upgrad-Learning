package collection_frmwk;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(Arrays.asList(9,5,8,6,1,2,1));
        System.out.println(pq);

        //for(int i=0;i<= pq.size()+1;i++)
        while (pq.size()>1)
        {
            int a=pq.poll();
            int b=pq.poll();
            int res= a-b;
            if(res>=1)
            {
                pq.add(res);
            }
        }
        if(pq.size()==1)
        {
            System.out.println("last stone in bag is: "+pq.peek());
        }
        else
            System.out.println("NO STONE LEFT");
    }
}
