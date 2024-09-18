package JavaClass.Week12;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Major> majors = new ArrayList<Major>();

        majors.add(new Major("COE", new ArrayList<Student>()));
        majors.get(0).addStudent(new Student("67100000", "AAA"));
        majors.get(0).addStudent(new Student("67110000", "BBB"));
        majors.get(0).addStudent(new Student("67120000", "CCC"));

        majors.add(new Major("CPE", new ArrayList<Student>()));
        majors.get(1).addStudent(new Student("67130000", "DDD"));
        majors.get(1).addStudent(new Student("67130011", "FFF"));

        for (Major major : majors) {
            System.out.println(major.toString());
            for (Student student : major.getStudents()) {
                System.out.println(student);
            }
        }
        System.out.println();

        majors.add(new Major("CVE", new ArrayList<Student>()));

        Student studentToMove = null;
        for (Student student : majors.get(1).getStudents()) {
            if (student.getStudentID().equals("67130000")) {
                studentToMove = student;
                break;
            }
        }

        if (studentToMove != null) {
            majors.get(1).removeStudent(studentToMove);
            majors.get(2).addStudent(studentToMove);
        }


        for (Major major : majors) {
            System.out.println(major.toString());
            for (Student student : major.getStudents()) {
                System.out.println(student);
            }
        }

        System.out.println();

        int choice;
        char Chose;
        do {
            System.out.println("Search Menu");
            System.out.println("1. by Major");
            System.out.println("2. by Student ID");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Major: ");
                    String major = sc.nextLine();
                    boolean found = false;
                    for (Major m : majors) {
                        if (m.getName().equals(major)) {
                            System.out.println(m.toString());
                            found = true;
                            for (Student student : m.getStudents()) {
                                System.out.println(student);
                            }
                        }

                    }
                    if (!found) {
                        System.out.println("Major not found");
                    }
                    break;
                case 2:
                    System.out.print("Enter Student ID: ");
                    String studentID = sc.nextLine();
                    boolean idfound = false;
                    for (Major m : majors) {
                        for (Student student : m.getStudents()) {
                            if (student.getStudentID().equals(studentID)) {
                                System.out.println("Major " + m.getName());
                                System.out.println(student);
                                idfound = true;
                            }
                        }
                    }
                    if (!idfound) {
                        System.out.println("Student ID not found");
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.print("Do you want to continue? (Y/N): ");
            Chose = sc.next().charAt(0);
            System.out.println("\n=====================================");

        }while (Chose == 'Y' || Chose == 'y');
        System.out.println("BYEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!");
    }
}
