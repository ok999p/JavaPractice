package JavaClass.Week10.Set2;

public class MajorCourse extends Course {
    protected int year;

    public MajorCourse(String id, int u, String g, int y) {
        super(id, u, g);
        this.year = y;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return super.toString() + "Year\t" + year;
    }
}
