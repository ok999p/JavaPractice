package JavaClass.Week2;

import java.util.Scanner;

public class RGBColorDifference {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int r1, r2, g1, g2, b1, b2;
        
        System.out.print("RGB Color1 : ");
        r1 = input.nextInt();
        g1 = input.nextInt();
        b1 = input.nextInt();

        System.out.print("RGB Color2 : ");
        r2 = input.nextInt();
        g2 = input.nextInt();
        b2 = input.nextInt();

        double DifferenceColor = Math.sqrt(Math.pow(r2 - r1, 2) + Math.pow(g2 - g1, 2) + Math.pow(b2 - b1, 2));
        System.out.print("Color Difference = " + DifferenceColor);
    }
}
