package Week6;

import java.util.Scanner;

public class ThaiDValidation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String id;
        System.out.print("Enter ID Number: ");
        id = in.nextLine();
        int checkDigit;
        int v = Penkonthaimai(id);
        int last = v % 11;
        if (last == 0) {
            int last2 = last % 10;
            id = id.substring(0, 12) + ((11 - last2) % 10);
            System.out.println("Invalid ID Number : " + id);
        }else{
            System.out.println("Valid ID Number");
        }
    }


    public static int Penkonthaimai(String id) {
        int sum = 0;
        int count = 13;
        for (int i = 0; i < 12; i++) {
            char c = id.charAt(i);
            int num = Character.getNumericValue(c);
            sum += num * count;
            count--;
        }

        return sum;
        //System.out.println("Last: " + last);
        //int lastDigit = Character.getNumericValue(id.charAt(12));
        //System.out.println("Last Digit: " + lastDigit);
    }
}
