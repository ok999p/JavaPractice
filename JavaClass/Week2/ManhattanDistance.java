package JavaClass.Week2;

import java.util.Scanner;

public class ManhattanDistance {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int x1, y1, x2, y2;
        System.out.print("P1(x, y): ");
        x1 = input.nextInt();
        y1 = input.nextInt();
        System.out.print("P2(x, y): ");
        x2 = input.nextInt();
        y2 = input.nextInt();
        System.out.println("Manhattan Distance: " + (Math.abs(x1 - x2) + Math.abs(y1 - y2)));
    }
}
