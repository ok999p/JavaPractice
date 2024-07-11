package JavaClass.Week5;

import java.util.Scanner;

public class MethodLoopQueenContest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int foot, inch, count = 1, countmax = 0;
        double max = 0, height = 0;
        char choice;

        do {
            System.out.print("No. " + count + " Enter height : ");
            char type = in.next().charAt(0);
            if (type == 'f') {
                foot = in.nextInt();
                inch = in.nextInt();
                height = Foot2Cm(foot, inch);
                System.out.println("No. " + count + " is " + height + " cm.");
            } else if (type == 'c') {
                height = in.nextDouble();
                System.out.println("No. " + count + " is " + height + " cm.");
            }

            if (height > max) {
                max = height;
                countmax = count;
            }

            System.out.print("Do you want to continue (y/n) :  ");
            choice = in.next().charAt(0);
            count++;
        } while (choice == 'y' || choice == 'Y');
        
        System.out.println("No. " + countmax + " The highest is " + max + " cm.");
        System.out.println("Bye Bye!!!");
    }

    public static double Foot2Cm(int foot, int inch) {
        return (foot * 12 + inch) * 2.54;
    }
}
