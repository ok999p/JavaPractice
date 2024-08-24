package JavaClass.Week12;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        display(list);
    }

    public static void display(ArrayList<Integer> list) {
        for (int i : list) {
            System.out.println(i);
        }
    }
}
