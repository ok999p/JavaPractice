package PrepareTest;

import java.util.Scanner;

public class NumtoHour {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int Hr, min, sec, total;
            System.out.println("Enter Second");
            int Sec = input.nextInt();
            Hr = Sec / 3600;
            Sec = Sec % 3600;
            min = Sec / 60;
            Sec = Sec % 60;
            sec = Sec;
            System.out.println(Hr);
            System.out.println(min);
            System.out.println(sec);
            
    }

}
