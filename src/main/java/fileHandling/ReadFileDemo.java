package fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo {             //Read Multiline File

    public static void main(String[] args) {

       try
       {
           FileReader fr=new FileReader("src/main/java/fileHandling/Readme");
           BufferedReader br=new BufferedReader(fr);

          // String data=br.readLine();
           String data;
           //System.out.println(data);
           String searchString="java";
           int index;
           int counter=0;
           while((data= br.readLine())!=null)
           {
               int startingIndex=0;
               do {
                   index=data.indexOf(searchString,startingIndex);

                   if(index!=-1)
                   {
                       counter++;
                       startingIndex=index+searchString.length();
                   }
               }
               while(index!=-1);
           }

           System.out.println(counter);


       } catch (IOException e) {
           System.out.println("Exception occured");
       }
    }


}
