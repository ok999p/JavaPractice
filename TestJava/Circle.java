package TestJava;

public class Circle {
    public final static double PI = 3.14159;

    protected double radius;

    public Circle(double radius) {
        this.radius = 1.0;
    }

    public Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return this.radius;
    }

    
}
