package PracticeJava;

public class Circle {
    double radius;

    Circle() {
        radius = 10.0;
    }
    Circle (double newRadius) {
        this.radius = newRadius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }
}
