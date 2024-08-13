package Week6;

import java.util.Scanner;

public class MethodLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = 0, n2 = 0, loops = 0;
        System.out.print("Enter no of loops: ");
        loops = in.nextInt();
        for (int i = 0 ; i < loops; i++) {
            n1 = in.nextInt();
            n2 = in.nextInt();
            printNum(n1, n2);
        }

    }

    public static void printNum(int n1, int n2 ) {
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
