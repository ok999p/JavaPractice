package JavaClass.Week3;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y;
        double total;
        System.out.println("Calculator (+,-,*,/,%)");
        System.out.println("=======================");
        System.out.print("Press +: Add\nPress -: Subtract\nPress *: Multiply\nPress /: Divide\nPress %: Modulo\n");
        System.out.print("Press operator: ");
        char operator = in.next().charAt(0);
        System.out.print("Please enter x: ");
        x = in.nextInt();
        System.out.print("Please enter y: ");
        y = in.nextInt();
        switch (operator) {
            case '+':
                total = x + y;
                System.out.println(x  + " + " + y  + " = " +  total);
                break;
            case '-':
                total = x - y;
                System.out.println(x  + " - " + y  + " = " +  total);
                break;
            case '*':
                total = x * y;
                System.out.println(x  + " * " + y  + " = " +  total);
                break;
            case '/':
                total = x / y;
                System.out.println(x  + " / " + y  + " = " +  total);
                break;
            case '%':
                total = x % y;
                System.out.println(x  + " % " + y  + " = " +  total);
                break;
        
            default:
                System.out.println("Invalid operator");
                break;
        }
        System.out.println("Bye Bye!!!");
    }

}
