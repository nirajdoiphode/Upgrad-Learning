package practiceAssignment.collectionDay1;

class Employee {
    int empId;
    String name;
    String role;
    int experience;

    public Employee(int empId, String name, String role, int experience) {
        this.empId = empId;
        this.name = name;
        this.role = role;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee ID: " + empId + ", Name: " + name +
                ", Role: " + role + ", Experience: " + experience + " years";
    }
}