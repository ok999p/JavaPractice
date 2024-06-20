package JavaClass.Week1;

import java.util.Scanner;

public class Foot2Cen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter feet and inches: ");
        int feet = input.nextInt();
        int inches = input.nextInt();
        System.out.println("You are " + feet + " feet," + inches + " inches tall.");
        int totalInches = feet * 12 + inches;
        System.out.println("Total inches : " + totalInches);
        double centimeters = totalInches * 2.54;
        System.out.println("Total centimeters : " + centimeters + " cm");
    }

}
