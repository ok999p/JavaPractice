package Week6;

import java.util.Scanner;

public class FindMinMaxArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positionmin = 0, positionmax = 0, min, max;
        char choice;
        do {
            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;
            positionmin = 0;
            positionmax = 0;
            System.out.print("Enter the number of elements: ");
            int n = input.nextInt();
            int[] aArray = new int[n];
            System.out.print("Enter " + n + " numbers: ");
            for (int i = 0; i < n; i++) {
                aArray[i] = input.nextInt();
            }
            for (int i = 0; i < aArray.length; i++) {
                if (aArray[i] < min) {
                    min = aArray[i];
                    positionmin = i;
                }
                if (aArray[i] > max) {
                    max = aArray[i];
                    positionmax = i;
                }
            }
            System.out.println("The maximum number is: " + max + " at position " + positionmax);
            System.out.println("The minimum number is: " + min + " at position " + positionmin);
            System.out.print("Do you want to continue (Y/N): ");
            choice = input.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
        System.out.println("Bye!");
        input.close();
    }
}
