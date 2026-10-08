package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class UnserializeEmployee {
    public static void main(String[] args) {
        try{
            Employee emp=null;

            FileInputStream fis=new FileInputStream("src/main/java/serialization/EmpDetails.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);

            emp=(Employee)ois.readObject();
            System.out.println("Object Deserialized Successfully");
            System.out.println(emp);
        }
        catch (Exception e){
            System.out.println("Exception: "+e);
        }
    }
}
