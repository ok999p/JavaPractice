package Set2;

import java.util.ArrayList;

public class PolymorphismCourse {
    public static void main(String[] args) {
        ArrayList<Course> c = new ArrayList<Course>();
        c.add(new Course("GEN64-124", 4, "D+"));
        c.add(new Course("GEN64-183", 1, "A"));
        c.add(new Course("ITD64-172", 2, "C+"));
        c.add(new MajorCourse("COE64-211", 4, "D", 2));
        c.add(new MajorCourse("COE64-212", 4, "D", 2));
        c.add(new MajorCourse("COE64-322", 1, "W", 2));
        System.out.println("Course : ");
        displayCourse(c);
        double gpa = calGPA(c);
        System.out.println("=============================");
        System.out.println("Enroll : " + c.size() + "\tPass : " + calPassSubject(c));
        System.out.println("GPA : " + gpa);
        
        String id = "GEN64-183";
        for (int i = 0; i < c.size(); i++) {
            if (c.get(i).getCourseID().equals(id)) {
                c.remove(i);
                i = c.size();            
            }
        }
        System.out.println();
        System.out.println("Course : ");
        c.add(new MajorCourse("COE64-447", 4, "F", 4));
        changeGrade(c, "ITD64-172", "W");
        displayCourse(c);
        System.out.println("=============================");
        gpa = calGPA(c);
        System.out.println("Enroll : " + c.size() + "\tPass : " + calPassSubject(c));
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
