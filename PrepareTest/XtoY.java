package PrepareTest;

import java.util.Scanner;

public class XtoY {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1,x2,y1,y2;
        double result;
        System.out.print("Input num");
        x1 = input.nextInt();
        y1 = input.nextInt();
        x2 = input.nextInt();
        y2 = input.nextInt();
        result = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.print("Result" + result);
    }
}
