package Week7;

import java.util.Scanner;

public class CalGPAWithMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double sum = 0, sumUnit = 0;
        int[] multi = {98, 72, 65, 51, 49};
        double[] unit = {1, 0.5, 1, 0.5, 1};  // หน่วยกิตของแต่ละวิชา

        n = unit.length; 
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            grade[i] = calGrade(multi[i]);
            sumUnit += unit[i];
        }

        for (int i = 0; i < n; i++) {
            switch (grade[i]) {
                case 'A':
                    sum += 4 * unit[i];
                    break;
                case 'B':
                    sum += 3 * unit[i];
                    break;
                case 'C':
                    sum += 2 * unit[i];
                    break;
                case 'D':
                    sum += 1 * unit[i];
                    break;
                case 'F':
                    sum += 0 * unit[i];
                    break;
                default:
                    break;
            }
        }

        System.out.println("Subject 1 2 3 4 5");
        System.out.println("================================");
        System.out.print("Unit  : ");
        for (int i = 0; i < n; i++) {
            System.out.print(unit[i] + " ");
        }
        System.out.println();
        System.out.print("Score : ");
        for (int i = 0; i < n; i++) {
            System.out.print(multi[i] + " ");
        }
        System.out.println();
        System.out.print("Grade : ");
        for (int i = 0; i < n; i++) {
            System.out.print(grade[i] + " ");
        }
        System.out.println();
        System.out.println("================================");
        System.out.printf("GPA = %.2f\n", sum / sumUnit);

        input.close();
    }

    public static char calGrade(int score) {
        char grade;
        if (score >= 80) {
            grade = 'A';
        } else if (score >= 70) {
            grade = 'B';
        } else if (score >= 60) {
            grade = 'C';
        } else if (score >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }
}
