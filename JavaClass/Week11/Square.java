package JavaClass.Week11;

public class Square extends Shape {
    private double width;

    public Square(String color, double width) {
        super(color);
        this.width = width;
    }

    public double getArea() {
        return width * width;
    }

    public double getPerimeter() {
        return 4 * width;
    }

    public String toString() {
        return "Square: Color: " + color + " Width: " + width + "\n Area: " + getArea() + " Perimeter: " + getPerimeter();
    }
}
