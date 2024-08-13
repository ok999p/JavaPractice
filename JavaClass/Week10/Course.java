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


    public void setGrade(String g) {
        this.grade = g;
    }


    public String getGrade() {
        return grade;
    }


    public String toString() {
        return courseID + "\t" + unit + "\t" + grade;
    }
}
