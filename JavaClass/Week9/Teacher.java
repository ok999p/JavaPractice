package JavaClass.Week9;

public class Teacher {
    private String name;
    private char gender;
    private int age;
    private char status;

    public Teacher(String name, char gender, int age, char status) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.status = status;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        String gendertoString = "";
        String statustoString = "";
        
        switch (gender) {
            case 'F':
                gendertoString = "Female";
                break;
            case 'M':
                gendertoString = "Male";
                break;
            default:
                break;
        }

        switch (status) {
            case 'S':
                statustoString = "Single";
                break;
            case 'M':
                statustoString = "Married";
                break;
            default:
                break;
        }

        return name + ", " + gendertoString + ", " + statustoString + ", " + age;
    }
}
