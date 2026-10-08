package enumD;

import java.util.Scanner;

import static enumD.MyErrors.*;

public class LoginForm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter username");
        String username=sc.next();
        System.out.println("Enter password");
        String password=sc.next();

        if(username.length()>=6)
        {

            if(password.length()>=8)
            {
                System.out.println("Login Successfull");
            }
            else
            {
                System.out.println(username+""+MyErrors.ERROR2.getErrorMessage());
            }
        }
        else
        {
            System.out.println(MyErrors.ERROR1.getErrorMessage());
        }
    }
}
