package String;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        String str="Virat kolji plays cricket a for rcb";

        String word[]=str.split(" ");
        //System.out.println(Arrays.toString(word));

        System.out.println("Smallest word in string: "+getSmallest(word));
        System.out.println("Largest word in string: "+getLargest(word));

   }

    public static String getSmallest(String[] word)
    {
        int min=10;
        String str=word[0];
        for(String x:word)
        {
            if(min>x.length())
            {
                min=x.length();
                str=x;

            }
        }
        return (min+" "+str);
    }

    public static String getLargest(String[] word)
    {
        int max=word[0].length();
        String str=word[0];
        for(String x:word)
        {
            if(x.length()>max)
            {
                max=x.length();
                str=x;

            }
        }
        return (max+" "+str);
    }
}
