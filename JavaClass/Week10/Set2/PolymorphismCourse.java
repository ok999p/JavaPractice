package JavaClass.Week10.Set2;

import java.util.ArrayList;

public class PolymorphismCourse {
    public static void main(String[] args) {
        ArrayList<Course> C = new ArrayList<Course>();
        C.add(new Course("GEN64-124", 4, "D+"));
        C.add(new Course("GEN64-183", 1, "A"));
        C.add(new Course("ITD64-172", 2, "C+"));
        C.add(new MajorCourse("COE64-211", 4, "D", 2));
        C.add(new MajorCourse("COE64-212", 4, "D", 2));
        C.add(new MajorCourse("COE64-322", 1, "W", 2));
        System.out.println("Course : ");
        displayCourse(C);
        double gpa = calGPA(C);
        System.out.println("=============================");
        System.out.println("Enroll : " + C.size() + "\tPass : " + calPassSubject(C));
        System.out.println("GPA : " + gpa);
        
        String id = "GEN64-183";
        for (int i = 0; i < C.size(); i++) {
            if (C.get(i).getCourseID().equals(id)) {
                C.remove(i);
                i = C.size();
            }
        }
        System.out.println();
        System.out.println("Course : ");
        C.add(new MajorCourse("COE64-447", 4, "F", 4));
        changeGrade(C, "ITD64-172", "W");
        displayCourse(C);
        System.out.println("=============================");
        gpa = calGPA(C);
        System.out.println("Enroll : " + C.size() + "\tPass : " + calPassSubject(C));
        System.out.println("GPA : " + gpa);


    }

    public static void displayCourse(ArrayList<Course> c) {
        for (Course course : c) {
            System.out.println(course.toString());
        }
    }

    public static int calPassSubject(ArrayList<Course> c) {
        int count = 0;
        for (Course course : c) {
            if (!course.getGrade().equals("W") && (course.getGrade().equals("A") || course.getGrade().equals("B")
                    || course.getGrade().equals("B+") || course.getGrade().equals("C+") || course.getGrade().equals("C")
                    || course.getGrade().equals("D+") || course.getGrade().equals("D"))) {
                count++;
            }
        }
        return count;
    }

    public static double calGPA(ArrayList<Course> c) {
        double gradepoint = 0, sum = 0, totalunit = 0;
        for (Course course : c) {
            if (!course.getGrade().equals("W")) {
                switch (course.getGrade()) {
                    case "A":
                        gradepoint = 4.0;
                        break;
                    case "B+":
                        gradepoint = 3.5;
                        break;
                    case "B":
                        gradepoint = 3.0;
                        break;
                    case "C+":
                        gradepoint = 2.5;
                        break;
                    case "C":
                        gradepoint = 2.0;
                        break;
                    case "D+":
                        gradepoint = 1.5;
                        break;
                    case "D":
                        gradepoint = 1.0;
                        break;
                    default:
                        gradepoint = 0.0; // For any other grade like "F"
                        break;
                }
                sum += gradepoint * course.getUnit();
                totalunit += course.getUnit();
            }
        }
        
        if (totalunit == 0) {
            return 0.0;
        }
        
        return sum / totalunit;
    }

    public static void changeGrade(ArrayList<Course> c, String id, String grade) {
        for (Course course : c) {
            if (course.getCourseID().equals(id)) {
                course.setGrade(grade);
            }
        }
    }
}
