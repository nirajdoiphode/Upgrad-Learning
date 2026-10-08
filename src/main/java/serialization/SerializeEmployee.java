package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeEmployee {
    public static void main(String[] args) {

        try
        {
            Employee emp=new Employee();

            FileOutputStream fos=new FileOutputStream("src/main/java/serialization/EmpDetails.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(emp);

            System.out.println("Object Serialized Successfully");
        }
        catch (Exception e)
        {
            System.out.println("Exception:"+e);
        }

    }
}
