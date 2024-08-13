package JavaClass.Week9;

public class TeacherArray {
    public static void main(String[] args) {
        Teacher[] teachers = new Teacher[5];
        teachers[0] = new Teacher("AAA", 'F', 40, 'M');
        teachers[1] = new Teacher("BBB", 'M', 51, 'S');
        teachers[2] = new Teacher("CCC", 'M', 39, 'M');
        teachers[3] = new Teacher("DDD", 'F', 45, 'S');
        teachers[4] = new Teacher("FFF", 'F', 31, 'S');
        printTeacher(teachers);
        System.out.println("=====================================");
        printgender(teachers);
        printstatus(teachers);
        printAverageAgeMaxmin(teachers);
    }

    public static void printTeacher(Teacher[] teachers) {
        for (int i = 0; i < teachers.length; i++) {
            System.out.println(teachers[i]);
        }
    }

    public static void printgender(Teacher[] teachers) {
        int countmale = 0, countfemale = 0;
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i].getGender() == 'M') {
                countmale++;
            } else {
                countfemale++;
            }
        }
        System.out.println("No. of Female :" + countfemale + ", No. of male :" + countmale);
    }

    public static void printstatus(Teacher[] teachers) {
        int countsingle = 0, countmarried = 0;
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i].getStatus() == 'S') {
                countsingle++;
            } else {
                countmarried++;
            }
        }
        System.out.println("No. of Single :" + countsingle + ", No. of Married :" + countmarried);
    }

    public static void printAverageAgeMaxmin(Teacher[] teachers) {
        double sum = 0;
        int max = teachers[0].getAge();
        int min = teachers[0].getAge();
        for (int i = 0; i < teachers.length; i++) {
            sum += teachers[i].getAge();
            if (teachers[i].getAge() > max) {
                max = teachers[i].getAge();
            }
            if (teachers[i].getAge() < min) {
                min = teachers[i].getAge();
            }
        }
        System.out.println("Average Age : " + sum / teachers.length + ", Max Age : " + max + ", Min Age : " + min);
    }
}
