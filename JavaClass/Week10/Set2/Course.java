package Set2;

public class Course {
    private String courseID;
    private int unit;
    private String grade;

    public Course(String id, int u, String g) {
        this.courseID = id;
        this.unit = u;
        this.grade = g;
    }

    public String getCourseID() {
        return courseID;
    }

    public int getUnit() {
        return unit;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String toString() {
        return courseID + "\t" + unit + "\t" + grade + "\t";
    }
}
