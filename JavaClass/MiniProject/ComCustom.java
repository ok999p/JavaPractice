package JavaClass.MiniProject;

public class ComCustom extends Order{
    CPU cpu;
    Ram ram;
    GPU gpu;
    SSD ssd;
    PSU psu;

    public ComCustom(){
        super();
    }

    public ComCustom(CPU c, Ram r, GPU g, SSD s, PSU p){
        this.cpu = c;
        this.ram = r;
        this.gpu = g;
        this.ssd = s;
        this.psu = p;
    }

    public int calPrice(){
        return this.cpu.getPrice() +  this.ram.getPrice() + this.gpu.getPrice() + this.ssd.getPrice() + this.psu.getPrice();
    }

    public String toString(){
        return super.toString() + "\n" + "=========================================" + "\n" + this.cpu.toString() + "\n" + this.ram.toString() + "\n" + this.gpu.toString() + "\n" + this.ssd.toString() + "\n" + this.psu.toString() + "\n" + "======================= Total Price: " + calPrice() + ".-";

    }

}
