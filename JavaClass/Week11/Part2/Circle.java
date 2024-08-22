package JavaClass.Week11.Part2;

public class Circle extends Shape {
    private int radius;

    public Circle(String color,int radius) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public void resize(int percent){
        radius = radius * percent / 100;
    }

    public int compareTo(Object obj) {
        Circle c = (Circle) obj;
        if (this.radius > c.radius) {
            return 1;
        } else if (this.radius < c.radius) {
            return -1;
        } else {
            return 0;
        }
    }

    public String toString() {
        return "Color: " + color + " Width: " + radius + "\n Area: " + getArea() + " Perimeter: "
                + getCircumference();
    }
}
