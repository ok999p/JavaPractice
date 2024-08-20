package JavaClass.Week11;

public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
