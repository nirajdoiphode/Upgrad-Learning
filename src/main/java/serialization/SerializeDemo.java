package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeDemo {
    public static void main(String[] args) {
        Student st=new Student("Sumedh","CSE","AKOLA");

        try{
            FileOutputStream fout=new FileOutputStream("src/main/java/serialization/Readme.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fout);

            oos.writeObject(st);
            System.out.println("Object written successfully");
        }
        catch(Exception e){
            System.out.println("Exception:"+e);
        }

    }

}
