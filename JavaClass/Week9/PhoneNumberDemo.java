package JavaClass.Week9;

import java.util.Scanner;

public class PhoneNumberDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of phone numbers: ");
        int n = sc.nextInt();
        sc.nextLine();
        PhoneNumber[] phoneNumbers = new PhoneNumber[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter phone number: ");
            phoneNumbers[i] = new PhoneNumber(sc.nextLine());
        }
        System.out.println("We have " + n + " phone numbers.");
        for (int i = 0; i < n; i++) {
            phoneNumbers[i].readAs();
            System.out.println();
            int[] freq = phoneNumbers[i].calFreq();
            System.out.println("Digit Summary:");
            for (int j = 0; j < freq.length; j++) {
                if (freq[j] > 0) {
                    System.out.print(j + " ");
                    for (int k = 0; k < freq[j]; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
