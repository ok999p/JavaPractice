package JavaClass.Week12;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartPhoneTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Human> humans = new ArrayList<Human>();
        humans.add( new Human("AAA", 26));
        humans.get(0).addSmartPhone(new SmartPhone("0819866339", "Huawei", "Android"));
        humans.get(0).addSmartPhone(new SmartPhone("0868884661", "iPhone", "iOS"));
        humans.get(0).addSmartPhone(new SmartPhone("0658997722", "OPPO", "Android"));
      //  Human human2 = ;
        humans.add(new Human("BBB", 19));
        humans.get(1).addSmartPhone(new SmartPhone("0878884661", "iPhone", "iOS"));
        humans.get(1).addSmartPhone(new SmartPhone("0958992222", "OPPO", "Android"));
        System.out.println(humans.get(0));
        System.out.println(humans.get(1));
        int choice;
        System.out.println("Select Menu");
        System.out.println("1. Add smartphone");
        System.out.println("2. Delete smartphone");
        System.out.println("3. Exit");
        System.out.println("===================================");
        do {
            System.out.println("Select");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter phone number:");
                    String number = sc.nextLine();
                    String brand = sc.nextLine();
                    String os = sc.nextLine();

                    System.out.println("Enter name:");
                    String name = sc.nextLine();
                    boolean foundHuman = false;
                    for (int i = 0; i < humans.size(); i++) {
                        if (name.equals(humans.get(i).getName())) {
                            foundHuman = true;
                            boolean numberExists = false;
                            for (SmartPhone phone : humans.get(i).getSmartPhone()) {
                                if (number.equals(phone.getNumber())) {
                                    numberExists = true;
                                    break;
                                }
                            }
                            if (numberExists) {
                                System.out.println("Duplicate phone number");
                            } else {
                                humans.get(i).addSmartPhone(new SmartPhone(number, brand, os));
                                System.out.println("Insert completed");
                                System.out.println(humans.get(i));
                            }
                            break;
                        }
                    }
                    if (!foundHuman) {
                        System.out.println("Name not found");
                    }
                    break;

                case 2:
                    System.out.println("Delete phone number:");
                    String numberDelete = sc.nextLine();
                    System.out.println("Enter name:");
                    String nameDelete = sc.nextLine();
                    boolean foundHumanToDelete = false;
                    for (int i = 0; i < humans.size(); i++) {
                        if (nameDelete.equals(humans.get(i).getName())) {
                            foundHumanToDelete = true;
                            boolean foundPhoneToDelete = false;
                            for (int j = 0; j < humans.get(i).getSmartPhone().size(); j++) {
                                if (numberDelete.equals(humans.get(i).getSmartPhone().get(j).getNumber())) {
                                    humans.get(i).deletePhone(j);
                                    System.out.println("Delete completed");
                                    System.out.println(humans.get(i));
                                    foundPhoneToDelete = true;
                                    break;
                                }
                            }
                            if (!foundPhoneToDelete) {
                                System.out.println("This number not found");
                            }
                            break;
                        }
                    }
                    if (!foundHumanToDelete) {
                        System.out.println("Name not found");
                    }
                    break;

                case 3:
                    System.out.println("Bye Bye!!!");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 3);



    }
}
