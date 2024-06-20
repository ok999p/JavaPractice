package JavaClass.Week1;

import java.util.Scanner;

public class Pizza {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of the pizza: ");
        double price = input.nextDouble();
        System.out.println("Enter the radius of pizza: ");
        double radius = input.nextDouble();
        double area = Math.PI * radius * radius;
        double pricePerSquareInch = price / area;
        System.out.println("The price per square inch of the pizza is " + pricePerSquareInch);
    }
}
