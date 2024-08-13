package JavaClass.Week9;

public class Square {
    private int width;

    public Square(int w) {
        width = w;
    }

    public void setWidth(int w) {
        width = w;
    }

    public int getWidth() {
        return width;
    }

    public int calArea() {
        return width * width;
    }

    public int calPerimeter() {
        return 4 * width;
    }

    public String toString() {
        return "Width: " + width + " Area: " + calArea() + " Perimeter: " + calPerimeter();
    }
    
}
