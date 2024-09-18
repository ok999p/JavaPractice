package JavaClass.MiniProject;

public class PSU{
    private String name;
    private int price;
    private double perform;

    public PSU(){
    }

    public PSU(String n,int p,double pr){
        this.name = n;
        this.price = p;
        this.perform = pr;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return " PSU :" + this.name +  "\t\t" +  this.price  + ".-";
    }

    public int compareTo(double pr){
        if(this.perform > pr){
            return 1;
        }
        else if(this.perform < pr){
            return -1;
        }
        else{
            return 0;
        }
    }

    public void changePSU(String n,int p,double pr){
        this.name = n;
        this.price = p;
        this.perform = pr;
    }

    public int getPrice(){
        return this.price;
    }

}
