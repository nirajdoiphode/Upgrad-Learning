package ExceptionHanding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionHandlingDemo1  {
    public static void main (String[] args)
    {
      try {
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           System.out.println("Enter Numerator: ");
           int n=Integer.parseInt(br.readLine());
           System.out.println("Enter Denominator: ");
           int d=Integer.parseInt(br.readLine());

           System.out.println("Result: "+(n/d));
       } catch (Throwable e) {
           System.out.println(e.getMessage());
       }
    }
}
