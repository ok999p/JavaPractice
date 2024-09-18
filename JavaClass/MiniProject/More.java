package JavaClass.MiniProject;

import javax.swing.*;
import java.util.ArrayList;
public class More extends Order {
    private ArrayList<Accessories> acs = new ArrayList<Accessories>();

    public More(){
        super();
    }
    public void addAcs(Accessories a){
        this.acs.add(a);
    }


    public int calPrice(){
        int sum = 0;
        for (Accessories i : acs) {
            sum += i.getPrice();
        }
        return sum;
    }


    public String toString(){
        String text = "";
        for (Accessories i : acs) {
            text += "\n" + i.toString();
        }
        return super.toString() + "\n" + "=========================================" + text + "\n======================= Total Price: " + calPrice() + ".-";
    }

}
