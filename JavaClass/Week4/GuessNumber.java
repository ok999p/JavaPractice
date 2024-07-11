package JavaClass.Week4;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 100);
        System.out.print(secretNumber);
        int guess = 0, count = 1;
        boolean correct = false;
        do {
            System.out.print("Enter your guess [1-100] : ");
            guess = in.nextInt();
            if (guess == secretNumber) {
                System.out.println("Congratulation! " + secretNumber + " is Secret Number" + "\nYou got it in " + count + " tries.");
                correct = true;
            } else if (guess < secretNumber) {
                System.out.println("Try higher.");
            } else {
                System.out.println("Try lower.");
            }
            count++;
        } while (!correct);
    }

}
