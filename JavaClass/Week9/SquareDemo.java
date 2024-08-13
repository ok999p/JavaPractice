package JavaClass.Week9;

import java.util.Scanner;

public class SquareDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the width of 1st the square: ");
            int w1 = sc.nextInt();
            System.out.print("Enter the width of 2nd the square: ");
            int w2 = sc.nextInt();
            Square s1 = new Square(w1);
            Square s2 = new Square(w2);
            s1.calArea();
            s1.calPerimeter();
            System.out.println("Display Square Information");
            System.out.println("Square 1: " + s1);
            System.out.println("Square 2: " + s2);
            System.out.println("======= Change the width of the objects =======");   
            System.out.print("Enter the new width of the 1st square: ");
            w1 = sc.nextInt();
            System.out.print("Enter the new width of the 2nd square: ");
            w2 = sc.nextInt();
            s1.setWidth(w1);
            s2.setWidth(w2);
            System.out.println("Display Square Information");
            System.out.println("Square 1: " + s1);
            System.out.println("Square 2: " + s2);
        sc.close();
    }
}
