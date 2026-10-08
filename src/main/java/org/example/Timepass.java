package org.example;

public class Timepass {
    public static void main(String[] args) {

        outer:
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.println(" i-: "+i+" \t j-: "+j);
                if(i==3)
                {
                    break outer;
                }
            }
        }

    }
}

