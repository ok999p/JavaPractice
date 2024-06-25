package JavaClass.Week3;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter score1 (1 - 100) : ");
        int score1 = in.nextInt();
        System.out.print("Enter score2 (1 - 100) : ");
        int score2 = in.nextInt();
        System.out.print("Enter score3 (1 - 100) : ");
        int score3 = in.nextInt();

        if (score1 < 50 || score2 < 50 || score3 < 50) {
            System.out.print("Fail");
        } else {
            double summean = (score1 + score2 + score3) / 3;
            if (summean >= 86) {
                System.out.print("Mean = " + summean + "\nGrade A  ");
            } else if (summean >= 66) {
                System.out.print("Mean = " + summean + "\nGrade B  ");
            } else if (summean >= 50) {
                System.out.print("Mean = " + summean + "\nGrade C  ");
            }
        }
    }
}