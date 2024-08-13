package JavaClass.Week8;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lotto3Card {
    private static DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Card card1 = new Card();
        Card card2 = new Card();
        Card card3 = new Card();
        do {
            System.out.print("Enter n: ");
            double n = sc.nextInt();
            double per = 0;
            for (int i = 0; i < n; i++) {            
                System.out.print(card1.getNumber() + " " + card2.getNumber() + " " + card3.getNumber() + " Summary is ");
                int sum = card1.getNumber() + card2.getNumber() + card3.getNumber();
                if (sum >= 10 && sum <= 19) {
                    System.out.println("between 10 and 19");
                    per++;
                } else {
                    System.out.println("Out of range");
                }
                card1.rand();
                card2.rand();
                card3.rand();
            }
            System.out.println("Percentage: " + df.format((per / n) * 100) + "%");
            System.out.print("Do you want to continue (y/n): ");
        } while(sc.next().charAt(0) == 'y');
    }
}