package JavaClass.MiniProject;

import javax.xml.crypto.Data;

public class CPU{
    private String name;
    private int price;
    private double perform;

    public CPU(){
    }

    public CPU(String n, int p, double pr){
        this.name = n;
        this.price = p;
        this.perform = pr;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return " CPU : " + this.name  +  "\t" +  this.price + ".-" ;
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

    public void changeCPU(String n, int p, double pr){
        this.name = n;
        this.price = p;
        this.perform = pr;
    }

    public int getPrice(){
        return this.price;
    }

}