package JavaClass.Week3;

import java.util.Scanner;

public class Day2YMD {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total day : ");
        int day = in.nextInt();
        int year = day / 365;
        int month = (day % 365) / 30;
        int days = (day % 365) % 30;
        System.out.println("Year : " + year + "\nMonth : " + month + "\nDays : " + days);
    }
}
