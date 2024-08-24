package JavaClass.Week10;


public class MajarCouurse extends Course {
    protected int year;


    public MajarCouurse(String id, int u, String g, int y) {
        super(id, u, g);
        this.year = y;
    }


    public int getYear() {
        return year;
    }


    public String toString() {
        return super.toString() + "\tYear" + year;
    }

    
    
}
