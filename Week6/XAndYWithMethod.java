package Week6;

import java.util.Scanner;

public class XAndYWithMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0, y = 0;
        char choice;
        do {
            System.out.print("x: ");
            x = in.nextInt();
            System.out.print("y: ");
            y = in.nextInt();
            if (x < y){
                int totalsum = sumXtoY(x, y);
                System.out.println("Answer is " + totalsum);
            }if(x > y){
                int totalmul = mulXtoY(y, x);
                System.out.println("Answer is " + totalmul);
            }if(x == y){
                System.out.println("0");
            }
            System.out.print("Do you want to continue? (y/n): ");
            choice = in.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
    }

    public static int sumXtoY(int x, int y) {
        int sum = 0;
        for (int i = x; i <= y; i++) {
            sum += i;
        }
        return sum;
    }

    public static int mulXtoY(int x, int y) {
        int mul = 1;
        for (int i = x; i <= y; i++) {
            mul *= i;
        }
        return mul;
    }
}
