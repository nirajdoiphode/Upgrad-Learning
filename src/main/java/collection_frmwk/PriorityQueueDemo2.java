package collection_frmwk;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo2 {

    public static void main(String[] args) {
        int orangeJuice=5;
        int mangoJuice=4;
        int appleJuice=4;

        int minTime=prepareOrder(orangeJuice,mangoJuice,appleJuice);
        System.out.println(minTime);
    }

    private static int prepareOrder(int orangeJuice, int mangoJuice, int appleJuice) {

        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        pq.add(orangeJuice);
        pq.add(mangoJuice);
        pq.add(appleJuice);

        Iterator<Integer> itr=pq.iterator();
        int seconds=0;
        while(!pq.isEmpty())
        {
            int j1=0;
            int j2=0;

            j1=pq.remove();

            if(itr.hasNext())
                j2=pq.remove();



            if(j1>0 && j2==0)
            {
                seconds+=j1;
                break;
            }



            if(j1>0 && j2>0)
            {
                seconds++;
                j1--;
                j2--;
            }

            if(j1>0)
                pq.add(j1);

            if(j1>0)
                pq.add(j2);
        }
        return seconds;
    }
}
