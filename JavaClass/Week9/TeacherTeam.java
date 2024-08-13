package JavaClass.Week9;

import java.util.Scanner;

public class TeacherTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Teacher Team\n");
        Teacher t1 = new Teacher("AAA", 'M', 40, 'S');
        Teacher t2 = new Teacher("BBB", 'F', 51, 'M');
        Teacher t3 = new Teacher("CCC", 'M', 39, 'S');
        double averageAge = (t1.getAge() + t2.getAge() + t3.getAge()) / 3.00;
        System.out.println("Average age of 3 teachers: " + averageAge);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.print("====== Change Status of 3rd teacher ======\n");
        System.out.print("Enter new status of 1st teacher: ");
        char newStatus = sc.next().charAt(0);
        t3.setStatus(newStatus);
        System.out.println(t3);
        System.out.println("====== Change age of 2nd teacher ======");
        System.out.print("Enter new age: ");
        int newAge = sc.nextInt();
        t2.setAge(newAge);
        System.out.println(t2);
        sc.close();
    }
}
