package JavaClass.Week12;

import java.util.ArrayList;

public class Human {
    private String name;
    private int age;
    private ArrayList<SmartPhone> phone;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        phone = new ArrayList<SmartPhone>();
    }

    public ArrayList<SmartPhone> getSmartPhone() {
        return phone;
    }

    public void addSmartPhone(SmartPhone phone) {
        this.phone.add(phone);
    }

    public void deletePhone(int index) {
        phone.remove(index);
    }

    public String getName() {
        return name;
    }


    public String toString() {
        String result = "Name: " + name + ", Age: " + age + ", Has " + phone.size() + " smartphones";
        for (SmartPhone phone : phone) {
            result = result + "\n" + phone.toString();
        }
        return result;
    }


}
