package PrepareTest;

import java.util.Scanner;

public class Coinj {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char text;
        System.out.print("Enter text");
        text = input.next().charAt(0);
        switch (text) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kuy ");
                break;

            default:
                break;
        }

    }
}
