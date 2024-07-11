package JavaClass.Week4;

import java.util.Scanner;

public class ProductElementMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row, col, numstart, count = 0;
        long total = 1;
        System.out.print("Enter mastrix row and column : ");
        col = in.nextInt();
        row = in.nextInt();
        System.out.print("Enter strat number : ");
        numstart = in.nextInt();
        System.out.print("Display\n");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(numstart + " ");
                total = total * numstart;
                numstart++;
            }
            System.out.println();
        }
        System.out.println("Product : " + total);
    }
}
