package practiceAssignment.collectionDay1;

public class Students {             //Que 1
    private String name;
    private int rollno;
    private int marks;
    private String course;
    public Students(String name, int rollno, int marks, String course) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
        this.course = course;
    }
    public Students(){}

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' + ", rollno=" + rollno +
                ", marks=" + marks + ", course='" + course + '\'' +
                '}'+"\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
