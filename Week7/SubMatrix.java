package Week7;

import java.util.Scanner;

public class SubMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter n: ");
        n = input.nextInt();
        int[][] aArray = createMatrix(n, input);
        int[][] bArray = createMatrix(n, input);
        int[][] result = subMatrix(aArray, bArray);

        printMatrix(aArray);
        printMatrix(bArray);
        printMatrix(result);
        
        input.close();
    }

    public static int[][] createMatrix(int n, Scanner input) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    public static int[][] subMatrix(int[][] aArray, int[][] bArray) {
        int n = aArray.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = aArray[i][j] - bArray[i][j];
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
