package JavaClass.Week4;

import java.util.Scanner;

public class LoopSmallestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, smallest = 0, lop, numlop;
        System.out.print("Enter number of loop : ");
        lop = in.nextInt();
        for (int i = 1; i <= lop; i++) {
            System.out.print("Plese enter numbers : ");
            numlop = in.nextInt();
            for (int j = 1; j <= numlop; j++) {
                System.out.print("Enter number : ");
                num = in.nextInt();
                if (i == 1) {
                    smallest = num;
                } else {
                    if (num < smallest) {
                        smallest = num;
                    }
                }
            }
            System.out.println(smallest + " is the smallest number.");
        }
    }
}
