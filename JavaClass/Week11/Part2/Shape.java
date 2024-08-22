package JavaClass.Week11.Part2;

public abstract class Shape implements Comparable, Resizeable {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();
    
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Shape[color=" + color + "]";
    }   
}
