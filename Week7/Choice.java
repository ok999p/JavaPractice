package Week7;

import java.util.Scanner;

public class Choice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = { { 1, 2, 1, 3, 3, 4, 5, 5, 1, 4 }, 
        { 4, 2, 1, 2, 3, 1, 5, 5, 1, 4 },
                { 5, 4, 4, 1, 3, 2, 5, 5, 1, 4 }, 
                { 3, 2, 1, 5, 4, 3, 5, 5, 1, 4 }, 
                { 1, 2, 4, 3, 3, 4, 5, 5, 1, 4 },
                { 2, 2, 5, 3, 3, 4, 5, 5, 1, 4 }, 
                { 5, 2, 5, 3, 3, 4, 5, 5, 1, 4 } };
        int[] key = { 4, 2, 4, 3, 3, 4, 1, 5, 1, 4 };
        int [] sumresult = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == key[j]) {
                    sum++;
                }
                sumresult[i] = sum;
            }
        }
            for (int j = 0; j < arr.length; j++) {
                System.out.println("Sum: " + sumresult[j]);
            }
            

        }
    
}
