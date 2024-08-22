package JavaClass.Week11.Part2;

public class Square extends Shape {
    private int width;

    public Square(String color, int width) {
        super(color);
        this.width = width;
    }

    public double getArea() {
        return width * width;
    }

    public double getPerimeter() {
        return 4 * width;
    }

    public void resize(int percent) {
        width = width * percent / 100;
    }

    public int compareTo(Object obj) {
        Square s = (Square) obj;
        if (this.width > s.width) {
            return 1;
        } else if (this.width < s.width) {
            return -1;
        } else {
            return 0;
        }
    }

    public String toString() {
        return "Color: " + color + " Width: " + width + "\n Area: " + getArea() + " Perimeter: "
                + getPerimeter();
    }
}
