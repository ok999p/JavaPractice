package JavaClass.Week4;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of loop : ");
        int lop = in.nextInt();
        for (int i = 1; i <= lop; i++) {
            System.out.print("Number [2 to 12] : ");
            int numlop = in.nextInt();
            if (numlop < 2 || numlop > 12) {
                System.out.println("Invalid number");
            } else {
                for (int j = 1; j <= 12; j++) {
                    System.out.println(numlop + " x " + j + " = " + (numlop * j));
                }

            }
            System.out.print("Bye Bye!!!");
        }
    }
}
