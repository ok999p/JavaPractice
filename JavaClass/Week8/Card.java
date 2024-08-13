package JavaClass.Week8;

public class Card {
    private int number;
    public Card() {
        this.rand();
    }

    public void rand() {
        this.number = (int) (Math.random() * 9) + 1;
    }

    public int getNumber() {
        return this.number;
    }
}
