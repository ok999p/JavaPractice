package JavaClass.Week3;

import java.util.Scanner;

public class NumoofMonth {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int month = in.nextInt();
            switch (month) {
                case 1: case 3:
                    System.out.println(31);
                    break;
                case 2:
                    System.out.println(28);
                    break;
               
                   
                case 4:
                    System.out.println(30);
                    break;
                case 5:
                    System.out.println(31);
                    break;
                case 6:
                    System.out.println(30);
                    break;
                case 7:
                    System.out.println(31);
                    break;
                case 8:
                    System.out.println(31);
                    break;
                case 9:
                    System.out.println(30);
                    break;
                case 10:
                    System.out.println(31);
                    break;
                case 11:
                    System.out.println(30);
                    break;
                case 12:
                    System.out.println(31);
                    break;
                default:
                    System.out.println("Invalid month number");
                    break;
            }
        }   
    }
