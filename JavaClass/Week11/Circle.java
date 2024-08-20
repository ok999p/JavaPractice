package JavaClass.Week11;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getCircumference() {
        return getPerimeter();
    }

    @Override
    public String toString() {
        return "Circle: Color: " + color + " Radius: " + radius + "\n Area: " + getArea() + " Circumference: " + getCircumference();
    }
}