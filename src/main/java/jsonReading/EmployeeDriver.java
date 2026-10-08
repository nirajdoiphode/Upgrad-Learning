package jsonReading;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class EmployeeDriver {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        List<Employee> employees = null;

        try{
            employees=mapper.readValue(
                    new File("src/main/java/jsonReading/Employee2.json"),
                    new TypeReference< List<Employee>>(){}
            );
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Employee Dept: ");
        String dept=scan.next();

        for (Employee employee : employees) {

//            if(employee.getDepartment().equalsIgnoreCase(dept))       //print all employees in specific dept
//            {
//                System.out.println(employee);
//            }
//            if(employee.getDepartment().equalsIgnoreCase(dept) && employee.getProjects().size()>=3)   //print employess having project >3 in specific dept
//            {
//                System.out.println(employee);
//            }

            if(employee.getProjects().size()>=2)            //print all employees having project >2
            {
                System.out.println(employee);
            }

            scan.close();
        }
    }
}
