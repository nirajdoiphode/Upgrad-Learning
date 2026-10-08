package practiceAssignment.collectionDay1;

import java.util.ArrayList;

public class Question3 {
    public static void main(String[] args) {

        // Developer employees
        ArrayList<Employee> developers = new ArrayList<>();

        developers.add(new Employee(101, "Rahul", "Java Developer", 3));
        developers.add(new Employee(102, "Amit", "Backend Developer", 2));
        developers.add(new Employee(103, "Sneha", "Full Stack Developer", 4));


        // Tester employees
        ArrayList<Employee> testers = new ArrayList<>();

        testers.add(new Employee(201, "Priya", "QA Tester", 3));
        testers.add(new Employee(202, "Rohit", "Automation Tester", 1));
        testers.add(new Employee(203, "Neha", "Software Tester", 5));


        // Designer employees
        ArrayList<Employee> designers = new ArrayList<>();

        designers.add(new Employee(301, "Kiran", "UI Designer", 2));
        designers.add(new Employee(302, "Pooja", "UX Designer", 4));
        designers.add(new Employee(303, "Akash", "Graphic Designer", 1));


        // Create project team
        ArrayList<Employee> projectTeam = new ArrayList<>();


        // Combine all employees
        projectTeam.addAll(developers);
        projectTeam.addAll(testers);
        projectTeam.addAll(designers);



        System.out.println("PROJECT TEAM ");

        for (Employee emp : projectTeam) {
            System.out.println(emp);
        }



        System.out.println("\nTotal Team Members: " + projectTeam.size());



        System.out.println("\n TEAM MEMBER NAMES ");

        for (Employee emp : projectTeam) {
            System.out.println(emp.name);
        }



        System.out.println("\n EMPLOYEES WITH MORE THAN 2 YEARS EXPERIENCE ");

        for (Employee emp : projectTeam) {

            if (emp.experience > 2) {
                System.out.println(emp);
            }
        }
    }
}
