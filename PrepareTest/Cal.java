package PrepareTest;

import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice;
        int num1, num2, total = 0;
        System.out.print("Enter number");
        num1 = input.nextInt();
        num2 = input.nextInt();
        System.out.println("Enter choice");
        choice = input.next().charAt(0);
        switch (choice) {
            case 'A':
                total = num1 + num2;
                break;
            case 'S':
                total = num1 - num2;

                break;
            case 'M':
                total = num1 * num2;

                break;
            case 'D':
                total = num1 / num2;

                break;

            default:
                System.out.println("Error");
                break;
        }
        System.err.println("Enter" + total);
    }

}
