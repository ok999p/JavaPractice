package Week6;

import java.util.Scanner;

public class ArrayOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ArrayNumber = new int[10];
        int sumeven = 0, sumodd = 0;
        char choice;
            do {
                System.out.println("Enter 0 to stop entering number");
                int i = 0;
                System.out.print("Enter number : ");
                while (true) {
                    ArrayNumber[i] = input.nextInt();
                    if (ArrayNumber[i] == 0) {
                        break;
                    }
                    i++;
                }

            for (i = 0; i < ArrayNumber.length; i++) {
                if (ArrayNumber[i] % 2 == 0) {
                    sumeven += ArrayNumber[i];
                } else if (ArrayNumber[i] % 2 != 0) {
                    sumodd += ArrayNumber[i];
                }
            }
            System.out.println("The sum of the square of the odd number is : " + sumodd);
            System.out.println("The sum of the square of the even number is : " + sumeven);
            System.out.print("Do you want to continue (Y/N) : ");
            choice = input.next().charAt(0);
            sumeven = 0;
            sumodd = 0;
        } while (choice == 'Y' || choice == 'y' );
    }
}
