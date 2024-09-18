package JavaClass.Week11;

import java.util.ArrayList;

public class TestShapeObject {
    public static void main(String[] args) {
        ArrayList<Shape> Spape2 = new ArrayList<>();

        Spape2.add(new Square("Orange", 4));
        Spape2.add(new Square("Orange", 10));
        Spape2.add(new Square("Orange", 5));
        Spape2.add(new Circle("Violet", 3));
        Spape2.add(new Circle("Violet", 6));
        Spape2.add(new Circle("Violet", 10));

        displayAllShape(Spape2);

        int[] squarePerimeterPositions = findMinMaxPerimeter(Spape2, Square.class);
        System.out.println("Square:");
        System.out.println("Max Perimeter is " + Spape2.get(squarePerimeterPositions[1]).getPerimeter() + " of No. " + (squarePerimeterPositions[1]));
        System.out.println("Min Perimeter is " + Spape2.get(squarePerimeterPositions[0]).getPerimeter() + " of No. " + (squarePerimeterPositions[0]));

        int[] circleCircumferencePositions = findMinMaxCircumference(Spape2, Circle.class);
        System.out.println("Circle:");
        System.out.println("Max Circumference is " + Spape2.get(circleCircumferencePositions[1]).getPerimeter() + " of No. " + (circleCircumferencePositions[1]));
        System.out.println("Min Circumference is " + Spape2.get(circleCircumferencePositions[0]).getPerimeter() + " of No. " + (circleCircumferencePositions[0]));
    }

    public static int[] findMinMaxPerimeter(ArrayList<Shape> shapes, Class<?> shapeType) {
        int minPos = -1;
        int maxPos = -1;
        double minPerimeter = Double.MAX_VALUE;
        double maxPerimeter = Double.MIN_VALUE;

        for (int i = 0; i < shapes.size(); i++) {
            Shape shape = shapes.get(i);
            if (shapeType.isInstance(shape)) {
                double perimeter = shape.getPerimeter();
                if (perimeter < minPerimeter) {
                    minPerimeter = perimeter;
                    minPos = i;
                }
                if (perimeter > maxPerimeter) {
                    maxPerimeter = perimeter;
                    maxPos = i;
                }
            }
        }
        return new int[]{minPos, maxPos};
    }

    public static int[] findMinMaxCircumference(ArrayList<Shape> shapes, Class<?> shapeType) {
        int minPos = -1;
        int maxPos = -1;
        double minCircumference = Double.MAX_VALUE;
        double maxCircumference = Double.MIN_VALUE;

        for (int i = 0; i < shapes.size(); i++) {
            Shape shape = shapes.get(i);
            if (shapeType.isInstance(shape)) {
                double circumference = shape.getPerimeter();
                if (circumference < minCircumference) {
                    minCircumference = circumference;
                    minPos = i;
                }
                if (circumference > maxCircumference) {
                    maxCircumference = circumference;
                    maxPos = i;
                }
            }
        }
        return new int[]{minPos, maxPos};
    }

    public static void displayAllShape(ArrayList<Shape> o) {
        for (Shape shape : o) {
            if (shape instanceof Square) {
                Square square = (Square) shape;
                System.out.println(square.toString());
            }
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println(circle.toString());
                
            }
        }
    }
}
    
