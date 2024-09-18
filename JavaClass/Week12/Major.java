package JavaClass.Week12;

import java.util.ArrayList;

public class Major {
    private String name;
    ArrayList<Student> s;

    public Major(String name, ArrayList<Student> s) {
        this.name = name;
        this.s = s;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Student> getStudents() {
        return this.s;
    }

    public void addStudent(Student s) {
        this.s.add(s);
    }

    public void removeStudent(Student s) {
        this.s.remove(s);
    }

    public String toString() {
        return "Major " + this.name + " : " + s.size() + " students";
    }
}
