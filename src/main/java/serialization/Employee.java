package serialization;

import java.io.*;

public class Employee implements Serializable {         //Custom Serialization
    private String name;
    private int age;
    private double salary;
    private String password;            //static fields are not serialized : Because static variables belong to the class, not to a particular object.
                                        // transient

    public Employee() {
        this.name = "Niraj";
        this.age = 22;
        this.salary = 75200;
        this.password = "Peaky@3022";
    }

    public Employee(String name, int age, double salary, String password) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", password='" + password + '\'' +
                '}';
    }

    public void writeObject(ObjectOutputStream oos) throws IOException {  //used with serializable interface
        oos.writeObject(name);
        oos.writeInt(age);
        oos.writeDouble(salary);
        oos.writeObject(password);
    }

    public void readObject(ObjectInputStream ois)throws IOException, ClassNotFoundException {  //used with serializable interface
        name=ois.readObject().toString();
        age=ois.readInt();
        salary=0;
        password=ois.readObject().toString();
    }

//    public void writeExternal(ObjectOutput oos) throws IOException {  //used with Externalizable interface
//        oos.writeObject(name);
//        oos.writeInt(age);
//        oos.writeDouble(salary);
////        oos.writeObject(password);
//    }
//
//    public void readExternal(ObjectInput ois) throws IOException, ClassNotFoundException {  //used with Externalizable interface
//        name=ois.readObject().toString();
//        age=ois.readInt();
//        salary=ois.readDouble();
////        password=ois.readObject().toString();
//    }
}
