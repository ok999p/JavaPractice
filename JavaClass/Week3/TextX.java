package JavaClass.Week3;

import java.util.Scanner;

public class TextX {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x : ");
        double num, a = 8, b = 16, c = 7,d = 5,z ;
        num = in.nextInt();
        if (num == 0) {
            z = (a / b) + (c / (2 * d));
        } else if (num % 2 == 0) {
            z = (Math.pow(a, 2) + Math.pow(b, 2)) / Math.abs(a - b);
        } else {
            z = a * c / b + d;
        }
        System.out.print("z is : " + z);
    }
}
