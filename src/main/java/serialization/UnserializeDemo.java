package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UnserializeDemo {
    public static void main(String[] args) throws Exception {
        Student s=null;

        FileInputStream fis=new FileInputStream("src/main/java/serialization/Readme.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        System.out.println(ois);
        s=(Student)ois.readObject();

        System.out.println(s);
    }
}
