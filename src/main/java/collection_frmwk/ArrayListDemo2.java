package collection_frmwk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        List<Student> fyStudents = new ArrayList<>();

        Student s1=new Student("Niraj",22,"ECE");
        Student s2=new Student("Sumedh",18,"Biology");

        fyStudents.addAll(Arrays.asList(s1,s2));

        List<Student> syStudents = new ArrayList<>();
        Student s3=new Student("Chetan",24,"Zoology");
        Student s4=new Student("Anuj",18,"Civil");
        syStudents.addAll(Arrays.asList(s3,s4));

        List<List<Student>> prmceam = new ArrayList<>();
        prmceam.add(fyStudents);
        prmceam.add(syStudents);


        for(List<Student> list:prmceam){
            System.out.println(list.get(0).getName());
        }
    }
}
