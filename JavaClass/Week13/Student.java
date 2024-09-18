package JavaClass.Week13;

public class Student {
    private String StudentID;
    private String name;
    private Login login;

    public Student(String StudentID, String name, String username, String password) {
        this.StudentID = StudentID;
        this.name = name;
        this.login = new Login(username, password);
    }

    public String getStudentID() {
        return StudentID;
    }

    public Login getLogin() {
        return login;
    }

    public String toString() {
        return "Student ID: " + StudentID + "\tName: " + name + login.toString();
    }
}
