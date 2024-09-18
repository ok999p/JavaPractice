package JavaClass.Week12;

public class SmartPhone {
    String number;
    String brand;
    String os;


    public SmartPhone(String number, String brand, String os) {
        this.number = number;
        this.brand = brand;
        this.os = os;
    }

    public String getNumber() {
        return number;
    }

    public String getBrand() {
        return brand;
    }

    public String getOs() {
        return os;
    }

    public String toString() {
        return "Number: " + number + ", Brand: " + brand + ", OS: " + os;
    }
}
