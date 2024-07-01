package JavaClass.Week3;

import java.util.Scanner;

public class PrintEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 1, num = 2;
        for (int i = 0; i < 100; i++ ) {
            System.out.print(num + " ");
            num += 2;
            if (count % 5 == 0) {
                System.out.println();
                count = 0;
            }
            count++;
        }
    }
}
