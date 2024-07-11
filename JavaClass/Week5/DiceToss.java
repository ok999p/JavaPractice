package JavaClass.Week5;

import java.util.Scanner;

public class DiceToss {
    public static void main(String[] args) {
        boolean sendbackis = isBetween6And12();
    }
    
    public static boolean isBetween6And12(){
        int n = 0, count = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = in.nextInt();
        boolean is6And12 = false;
        
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                int die = (int)(Math.random() * 6) + 1;
                sum += die;
                System.out.print(die + " ");
            }
            if (sum >= 6 && sum <= 12) {
                System.out.print(" is between 6 and 12");
                is6And12 = true;
                count++;
            } else {
                System.out.print(" is out of range");
                is6And12 = false;
            }
            System.out.println();
        }
        double percentage = (double) count / n * 100;
        System.out.printf("Percentage: %.2f%%\n", percentage);
        return is6And12;
    }
}
