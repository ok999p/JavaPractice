package JavaClass.Week3;

import java.util.Scanner;

public class TestChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Any character: ");
        char ch = in.next().charAt(0);
        if (Character.isLetter(ch)) {
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch + " is a vowel.");
                    break;
                default:
                    System.out.println(ch + " is a consonant.");
                    break;
            }
        }else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a number.");
        } else {
            System.out.println(ch + " is a special character.");
        }
    }
}
