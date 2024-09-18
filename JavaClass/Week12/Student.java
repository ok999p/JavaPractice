package JavaClass.Week12;

public class Student {
    private String studentID;
    private String name;

    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public String getStudentID() {
        return this.studentID;
    }

    public String toString() {
        return "ID: " + this.studentID + " Name: " + this.name;
    }

}
