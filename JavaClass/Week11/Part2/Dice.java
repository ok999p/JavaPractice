package JavaClass.Week11.Part2;

public class Dice implements Tossable {
    private int number;

    public Dice() {
        number = 0;
    }

    @Override
    public void toss() {
        number = (int)(Math.random() * 6) + 1;
    }

    public int getNumber() {
        return number;
    }
}