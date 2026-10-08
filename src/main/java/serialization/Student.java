package serialization;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String branch;
    private String city;


    public Student(String name, String branch, String city) {
        this.name = name;
        this.branch = branch;
        this.city = city;
    }
    public Student()
    {
        this.branch="CSE";
        this.name="Niraj";
        this.city="pune";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public void setCity(String city) {
        this.city = city;
    }
}
