package ExceptionHanding;

import java.util.Scanner;

public class ExceptionChainingDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Length: ");
        int length=sc.nextInt();

        System.out.println("Enter width: ");
        int width=sc.nextInt();

        try{
            calcArea(length,width);
        }
        catch(ArithmeticException e){
            System.out.println("Something gone wrong");
        }
    }


    public static int calcArea(int length, int width) throws ArithmeticException
    {
       if(length==0 || width==0)
       {
          throw new ArithmeticException();
       }

        return length*width;
    }
}
