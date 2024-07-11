package JavaClass.Week4;

import java.util.Scanner;

public class Multiplication2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c;
        do {
            System.out.print("Number [2 to 12] : ");
            int numlop = in.nextInt();
            if (numlop < 2 || numlop > 12) {
                System.out.println("Invalid number");
                c = 'Y';
            } else {
                for (int j = 1; j <= 12; j++) {
                    System.out.println(numlop + " x " + j + " = " + (numlop * j));
                }
                System.out.print("Do you want to continue? [Y/N] : ");
                c = in.next().charAt(0);
            }
        } while (c == 'Y' || c == 'y');
        System.out.println("Bye Bye!!!");
    }
}
