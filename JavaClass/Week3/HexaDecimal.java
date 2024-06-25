package JavaClass.Week3;

import java.util.Scanner;

public class HexaDecimal {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter interger : ");
        int num = in.nextInt();
        if (num < 10) {
            System.out.print("HexaDecimal : " + num);
        } else if (num >= 10 && num <= 15) {
            System.out.print("HexaDecimal : " + (char) (num % 10 + 65));
        } else {
            System.out.print("Error input");
        }
    }
}

// String hex = Integer.toHexString(num);
// System.out.print("HexaDecimal : " + hex);