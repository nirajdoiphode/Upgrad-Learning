package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
       try {
           FileInputStream fis = new FileInputStream("src/main/java/fileHandling/InputStreamReadme");
           int n;
           do
           {
              n=fis.read();
               System.out.println((char) n+"  :  "+n);

           }
           while((fis.read())!=-1);
       }
       catch (Exception e) {
           System.out.println("Exception Occured");
       }
    }
}
