package JavaClass.Week4;

import java.util.Scanner;

public class FindMinMaxMeanLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int min = 0, max = 0, sum = 0, lop = 0;
        boolean validInput;

        do {
            validInput = true;
            sum = 0; 
            System.out.print("Enter total number[2 to 12] : ");
            lop = in.nextInt();
            
            if (lop >= 2 && lop <= 12) {
                System.out.print("Enter number : "); 
                for (int i = 1; i <= lop; i++) {
                    int num = in.nextInt();
                    if (i == 1) {
                        min = num;
                        max = num;
                    } else {
                        if (num < min) {
                            min = num;
                        }
                        if (num > max) {
                            max = num;
                        }
                    }
                    sum += num;
                }
                System.out.println("Max : " + max);
                System.out.println("Min : " + min);
                System.out.println("Mean : " + (double) sum / lop);
            } else {
                System.out.println("Invalid number");
                validInput = false;
            }
        } while (validInput);

        System.out.println("Bye Bye!!!");
    }
}
