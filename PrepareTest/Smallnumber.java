package PrepareTest;

import java.util.Scanner;

public class Smallnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2 , n3 , min;
        System.out.print("Enter number");
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();
        min = n1;
        if (min > n2){
            min = n2;
        }else if (min > n3){
            min = n3;
        }
        System.out.println("Num is    " + min);
    }
}
