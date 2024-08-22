package JavaClass.Week11.Part2;

import java.util.Scanner;

public class TossableObject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueGame;

        do {
            System.out.print("Enter n: ");
            int n = scanner.nextInt();
            Dice[] diceArray = new Dice[5];
            int countInRange = 0;

            for (int i = 0; i < 5; i++) {
                diceArray[i] = new Dice();
            }

            for (int i = 0; i < n; i++) {
                int sum = 0;
                System.out.print((i + 1) + "\t");
                for (int j = 0; j < 5; j++) {
                    diceArray[j].toss();
                    int diceNumber = diceArray[j].getNumber();
                    sum += diceNumber;
                    System.out.print(diceNumber + " ");
                }

                if (sum >= 6 && sum <= 12) {
                    System.out.println("\tBetween 6 And 12");
                    countInRange++;
                } else {
                    System.out.println("\tOut of Range");
                }
            }

            double percentage = (double) countInRange / n * 100;
            System.out.printf("Percentage %.2f%%\n", percentage);

            System.out.print("Do you want to continue [y/n]: ");
            continueGame = scanner.next();
        } while (continueGame.equalsIgnoreCase("y"));

        System.out.println("Bye Bye !!!");
        scanner.close();
    }
}
