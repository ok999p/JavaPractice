package JavaClass.Week11.Part2;

import java.util.ArrayList;

public class ResizeAndCompareShape {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Square("Orange", 4));
        shapes.add(new Square("Orange", 10));
        shapes.add(new Square("Orange", 5));
        shapes.add(new Circle("Violet", 3));
        shapes.add(new Circle("Violet", 6));
        shapes.add(new Circle("Violet", 10));
        System.out.println("After resizing:");
        shapes.get(1).resize(200);
        shapes.get(4).resize(50);
        displayAllShape(shapes);
        System.out.println("===================================================");
        System.out.println("Compare 2 Squares after resize");
        if (shapes.get(0).compareTo(shapes.get(1)) > 0) {
            System.out.println("Square 1 is bigger than Square 2");
        } else if (shapes.get(0).compareTo(shapes.get(1)) < 0) {
            System.out.println("Square 1 is smaller than Square 2");
        } else {
            System.out.println("Square 1 equal to Square 2");
        }
        System.out.println("Compare 2 Circle after resize");
        if (shapes.get(4).compareTo(shapes.get(3)) > 0) {
            System.out.println("Circle 1 is bigger than Circle 2");
        } else if (shapes.get(4).compareTo(shapes.get(3)) < 0) {
            System.out.println("Circle 1 is smaller than Circle 2");
        } else {
            System.out.println("Circle 1 equal to Circle 2");
        }
    }


    public static void displayAllShape(ArrayList<Shape> shapes) {
        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                Square square = (Square) shape;
                System.out.println(square.toString());
            } else if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println(circle.toString());
            }
        }
    }
}
