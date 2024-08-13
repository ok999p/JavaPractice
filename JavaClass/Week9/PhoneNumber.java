package JavaClass.Week9;

public class PhoneNumber {
    private String number;

    public PhoneNumber(String number) {
        this.number = number;
    }

    public void readAs() {
        System.out.println(this.number + " Read as: ");
        for (int i = 0; i < this.number.length(); i++) {
            switch (this.number.charAt(i)) {
                case '0':
                    System.out.print("Zero ");
                    break;
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("Two ");
                    break;
                case '3':
                    System.out.print("Three ");
                    break;
                case '4':
                    System.out.print("Four ");
                    break;
                case '5':
                    System.out.print("Five ");
                    break;
                case '6':
                    System.out.print("Six ");
                    break;
                case '7':
                    System.out.print("Seven ");
                    break;
                case '8':
                    System.out.print("Eight ");
                    break;
                case '9':
                    System.out.print("Nine ");
                    break;
                default:
                    break;
            }
        }
        System.out.println();
    }

    public int[] calFreq() {
        int[] freq = new int[10];
        for (int i = 0; i < this.number.length(); i++) {
            if (Character.isDigit(this.number.charAt(i))) {
                freq[Character.getNumericValue(this.number.charAt(i))]++;
            }
        }
        return freq;
    }

    public String toString() {
        return this.number;
    }
}
