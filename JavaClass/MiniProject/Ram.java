package JavaClass.MiniProject;

public class Ram{
    private String name;
    private int price;
    private double perform;

    public Ram(){
    }

    public Ram(String n,int p,double pr){
        this.name = n;
        this.price = p;
        this.perform = pr;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return " Ram : " + this.name   +  "\t" +  this.price + ".-";
    }

    public int compareTo(double pr){
        if(this.perform == pr){
            return 1;
        }
        else if (this.perform > pr){
            return -1;
        }
        else{
            return 0;
        }
    }

    public void changeRam(String n,int p,int pr){
        this.name = n;
        this.price = p;
        this.perform = pr;
    }

    public int getPrice(){
        return this.price;
    }

}