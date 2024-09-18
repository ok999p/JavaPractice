package JavaClass.Week10;


public class CourseCheck {
    public static void main(String[] args) {
        Course[] c = new Course[6];
        c[0] = new Course("GEN64-124", 4, "D+");
        c[1] = new Course("GEN64-183", 1, "A");
        c[2] = new Course("ITD64-172", 2, "C+");
        c[3] = new MajarCouurse("COE64-211" , 4, "D", 2);
        c[4] = new MajarCouurse("COE64-212", 4, "D", 2);
        c[5] = new MajarCouurse("COE64-322", 1, "W", 2);
        displayCourse(c);
        changeGrade(c, "ITD64-172", "W");
        System.out.println("Change Grade of subject : ITD64-172");
        System.out.println("Change to grade  : W");
        System.out.println("======================================");
        displayCourse(c);
    }

    public static void displayCourse(Course[] c) {
        int countgen = 0 ,countmajor = 0;
        System.out.println("General Education Course : ");
        for (int i = 0; i < 3; i++) {
            System.out.println(c[i].toString());
        }
        countgen = calPassSubject(c, 0, 3);
        System.out.println("Enroll:\t3" + "\tPass :\t" + countgen);
        System.out.println("======================================");
        System.out.println("Major Course");
        for (int i = 3; i < 6; i++) {
            System.out.println(c[i].toString());
        }
        countmajor = calPassSubject(c, 3, 6);
        System.out.println("Enroll:\t3" + "\tPass :\t" + countmajor);
        System.out.println("======================================");
        System.out.println("GPA : " + calGPA(c));
        System.out.println("======================================");
    }

    public static int calPassSubject(Course[] c, int start, int end) {
        int count = 0;
        for (int i = start; i < end; i++) {
            if (!c[i].getGrade().equals("W") && (c[i].getGrade().equals("A") || c[i].getGrade().equals("B") 
                || c[i].getGrade().equals("B+") || c[i].getGrade().equals("C+") || c[i].getGrade().equals("C") 
                || c[i].getGrade().equals("D+") || c[i].getGrade().equals("D"))) {
                count++;
            }
        }
        return count;
    }
    

    public static double calGPA(Course[] c) {
        double gradepoint = 0, sum = 0, totalunit = 0, g = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] != null && !c[i].getGrade().equals("W")) {
                if (c[i].getGrade().equals("A")) {
                    gradepoint = 4.0;
                } else if (c[i].getGrade().equals("B+")) {
                    gradepoint = 3.5;
                } else if (c[i].getGrade().equals("B")) {
                    gradepoint = 3.0;
                } else if (c[i].getGrade().equals("C+")) {
                    gradepoint = 2.5;
                } else if (c[i].getGrade().equals("C")) {
                    gradepoint = 2.0;
                } else if (c[i].getGrade().equals("D+")) {
                    gradepoint = 1.5;
                } else if (c[i].getGrade().equals("D")) {
                    gradepoint = 1.0;
                } else {
                    gradepoint = 0.0;
                }
                g = gradepoint * c[i].getUnit();
                sum += g;
                totalunit += c[i].getUnit(); 
            }
        }
        return sum / totalunit;
    }
    

    public static void changeGrade(Course[] c, String id, String g) {
        for (int i = 0; i < c.length; i++) {
            if (c[i].getCourseID().equals(id)) {
                c[i].setGrade(g);
            }
        }
    }
    
}
