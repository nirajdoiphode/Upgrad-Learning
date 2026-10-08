package collection_frmwk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("true");

        ArrayList<String> list1=new ArrayList<>();

        list1.add("Pune");
        list1.add("Mumbai");
        list1.add("Delhi");
        System.out.println("list size: "+list1.size());
       // list.get(5); // throws exception

        List<List<String>> india=new ArrayList();               //Multi-dimensional list
        india.add(list);
        india.add(list1);
        System.out.println(india.size());

        System.out.println(india);
    }
}
