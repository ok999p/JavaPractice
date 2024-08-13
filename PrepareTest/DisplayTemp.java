package PrepareTest;

import java.util.Scanner;
import java.time.Month;

public class DisplayTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double min, max;
        int countmax = 0, countmin = 0;
        double[] temper = new double[12];
        for (int i = 0; i < 12; i++) {
            System.out.print("Enter temperature for " + Month.of(i + 1) + ": ");
            temper[i] = input.nextDouble();
        }
        min = temper[0];
        max = temper[0];
        for (int i = 0 ; i < 12 ; i++){
            if (min > temper[i]) {
                min = temper[i];
                countmin = i;
            }
            if (max < temper[i]) {
                max = temper[i];
                countmax = i;
            }
        }

        System.out.println("Max is" + max + "On" + Month.of(countmax));
        System.out.println("Min is" + min + "On" + Month.of(countmin));
    }
}
