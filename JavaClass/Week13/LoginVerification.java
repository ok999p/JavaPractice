package JavaClass.Week13;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginVerification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Major> majors = new ArrayList<>();

        Major coeMajor = new Major("COE");
        coeMajor.addStudent(new Student("67100000", "AAA", "SD0010", "Sd5648**"));
        coeMajor.addStudent(new Student("67110000", "BBB", "SD0011", "Sd0001**"));
        coeMajor.addStudent(new Student("67120000", "CCC", "SD0012", "Sd0002**"));
        majors.add(coeMajor);

        Major cpeMajor = new Major("CPE");
        cpeMajor.addStudent(new Student("67130000", "DDD", "SD0013", "Sd0003**"));
        cpeMajor.addStudent(new Student("67130011", "FFF", "SD0100", "Sd5648#55"));
        majors.add(cpeMajor);

        displayMajors(majors);

        char choice;
        System.out.println("Welcome to Login Verification");

        do {
            System.out.println("Enter ID: ");
            String id = sc.nextLine();

            Student foundStudent = null;
            for (Major major : majors) {
                for (Student student : major.getStudents()) {
                    if (id.equals(student.getStudentID())) {
                        foundStudent = student;
                        break;
                    }
                }
                if (foundStudent != null) break;
            }

            if (foundStudent != null) {
                System.out.println("Enter Username: ");
                String username = sc.nextLine();
                System.out.println("Enter Password: ");
                String password = sc.nextLine();

                if (foundStudent.getLogin().isMatch(username, password)) {
                    System.out.println("Welcome to program");
                    System.out.println(foundStudent.toString());

                } else {
                    System.out.println("Login Failed");
                }
            } else {
                System.out.println("ID does not match.");
            }

            System.out.println("Do you want to continue? (y/n)");
            choice = sc.next().charAt(0);
            sc.nextLine();
        } while (choice != 'n');
        System.out.println("BYE BYE!!!");
        sc.close();
    }

    public static void displayMajors(ArrayList<Major> majors) {
        for (Major major : majors) {
            System.out.println(major.toString());
        }
    }
}
