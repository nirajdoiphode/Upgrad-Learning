package OOP;

import java.util.Scanner;

class ThisDemo {

    private int rollno;
    private String name;
    private String email;

    public void setData(int rollno, String name, String email)
    {
        this.rollno=rollno;
        this.name=name;
        this.email=email;
    }

    public void displayData()
    {
        System.out.println("Roll no:"+rollno);
        System.out.println("Name:"+name);
        System.out.println("Email:"+email);
    }

}
