package JavaClass.MiniProject;

public class Accessories extends Order{
    private String name;
    private int price;


    public Accessories(){

    }

    public Accessories(String n, int p){
        this.name = n;
        this.price = p;
    }

    public String getName(){
        return this.name ;
    }

    public String toString(){
        return this.name + " " + this.price + ".-";
    }

    public int getPrice(){
        return this.price;
    }
}
