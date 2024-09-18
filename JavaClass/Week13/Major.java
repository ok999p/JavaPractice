package JavaClass.Week13;

import java.util.ArrayList;

public class Major {
    private String name;
    private ArrayList<Student> s;

    public Major(String name) {
        this.name = name;
        s = new ArrayList<Student>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudents() {
        return s;
    }

    public void addStudent(Student student) {
        s.add(student);
    }

    public void deleteStudent(Student student) {
        s.remove(student);
    }

    public String toString() {
        String str = "Major " + name +  ": " + s.size() + " Student\n";
        for (Student student : s) {
            str += student.toString() + "\n";
        }
        return str;
    }
}
