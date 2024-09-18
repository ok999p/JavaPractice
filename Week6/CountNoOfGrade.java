package Week6;

import java.util.Scanner;

public class CountNoOfGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of students: ");
        n = input.nextInt();
        char[] grades = {'A', 'B', 'C', 'D', 'F'};
        int[] freq = new int[5];
        char[] inputGrades = new char[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the grade of student " + (i + 1) + " : ");
            inputGrades[i] = input.next().charAt(0);
            switch (inputGrades[i]) {
                case 'A':
                    freq[0]++;
                    break;
                case 'B':
                    freq[1]++;
                    break;
                case 'C':
                    freq[2]++;
                    break;
                case 'D':
                    freq[3]++;
                    break;
                case 'F':
                    freq[4]++;
                    break;
                default:
                    System.out.println("Invalid grade entered.");
                    break;
            }
        }

        printChar(freq, grades);
    }

    public static void printChar(int[] freq, char[] grades) {
        System.out.println("Grade Summary:");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + ": ");
            for (int j = 0; j < freq[i]; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
