package JavaClass.Week2;

import java.util.Scanner;

public class CoinExchange {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int coin1, coin2, coin5, coin10, bank1000 = 0, bank500, bank100, bank50, bank20, change10;

        System.out.print("Coin 10 Bath : ");
        coin10 = input.nextInt();

        System.out.print("Coin 5 Bath : ");
        coin5 = input.nextInt();

        System.out.print("Coin 2 Bath : ");
        coin2 = input.nextInt();

        System.out.print("Coin 1 Bath : ");
        coin1 = input.nextInt();

        int total = (coin10 * 10) + (coin5 * 5) + (coin2 * 2) + (coin1 * 1);
        System.out.println("Total : " + total + " Bath");

        bank1000 = total / 1000;
        total = total % 1000;
        System.out.println("Bank 1000 Bath : " + bank1000);

        bank500 = total / 500;
        total = total % 500;
        System.out.println("Bank 500 Bath : " + bank500);

        bank100 = total / 100;
        total = total % 100;
        System.out.println("Bank 100 Bath : " + bank100);

        bank50 = total / 50;
        total = total % 50;
        System.out.println("Bank 50 Bath : " + bank50);

        bank20 = total / 20;
        total = total % 20;
        System.out.println("Bank 20 Bath : " + bank20);

        change10 = total / 10;
        total = total % 10;
        System.out.println("Change for 10 Bath is : " + change10);
    }
}
