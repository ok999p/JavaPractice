package JavaClass.Week8;

import java.util.Scanner;

public class SmsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SMS smsone = new SMS();
        SMS smstwo = new SMS();
        SMS smsthree = new SMS();
        System.out.print("\nSMS number: ");
        String number = sc.nextLine();
        smsone.Sms(number);
        smsone.readAs();
        System.out.print("\nSMS number: ");
        number = sc.nextLine();
        smstwo.Sms(number);
        smstwo.readAs();
        System.out.print("\nSMS number: ");
        number = sc.nextLine();
        smsthree.Sms(number);
        smsthree.readAs();
        System.out.println("==========================================");
        boolean result = equals(smsone, smstwo);
        if (result) {
            System.out.println("\n1 is equal to SMS Number 2.");
        } else {
            System.out.println("\n1 is not equal to SMS Number 2.");
        }
        result = equals(smsone, smsthree);
        if (result) {
            System.out.println("1 is equal to SMS Number 2.");
        } else {
            System.out.println("1 is not equal to SMS Number 2.");
        }
        sc.close();
    }

    public static boolean equals(SMS smsone, SMS smstwo) {
        return smsone.toString().equals(smstwo.toString());
    }
}
