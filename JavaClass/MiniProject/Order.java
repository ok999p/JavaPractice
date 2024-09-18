package JavaClass.MiniProject;

import java.time.LocalDateTime;
public class Order{
    private LocalDateTime date;


    public Order (){
        date = LocalDateTime.now();
    }


    public String toString(){
        return "\nรายการคำสั่งซื้อของท่าน" + "\n" + "=========================================" + "\n" + "Date : " + this.date;
    }
}
