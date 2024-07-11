package JavaClass.Week5;

import java.util.Scanner;

public class DisplayOddAndEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start, end;
        System.out.print("Enter the start number: ");
        start = in.nextInt();
        System.out.print("Enter the end number: ");
        end = in.nextInt();
        displayEven(start, end);
        displayOdd(start, end);
    }

    public static void displayEven(int n1, int n2) {
        System.out.print("Even numbers: ");
        for (int i = n1; i <= n2; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
    
    public static void displayOdd(int n1, int n2) {
        System.out.print("\nOdd numbers: ");
        for (int i = n1; i <= n2; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
