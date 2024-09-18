package JavaClass.MiniProject;

public class Database {
    private String[] cpu = {"INTEL I3-12100F", "INTEL I5-14600K", "INTEL I9-14900KS"};
    private String[] ram = {"T-FORCE VULCAN 8GB (8x1) DDR5 ", "RAM (แรม) GeIL ORION V 32GB ", "RAM (แรม) GeIL ORION V RGB 32GB (16x2)"};
    private String[] gpu = {"ASUS ROG STRIX GEFORCE RTX 4090  ", "MSI GEFORCE RTX 4070 TI ", "INNO3D GEFORCE GTX 1650"};
    private String[] ssd = {"M.2 (เอสเอสดี) WD BLUE SN580 250GB ", "M.2 (เอสเอสดี) WD BLACK SN770 500GB ", "M.2 (เอสเอสดี) WD BLACK SN770 1TB"};
    private String[] psu = {"PSU (อุปกรณ์จ่ายไฟ) CORSAIR CX650 650W", "PSU (อุปกรณ์จ่ายไฟ) GIGABYTE GP-P550SS 550W", "PSU (อุปกรณ์จ่ายไฟ) AEROCOOL UNITED POWER 600W"};

    private final int[] price_cpu = {2990, 11990, 27490};
    private final int[] price_ram = {1190,3990, 4190};
    private final int[] price_gpu = {93990,37990,4790};
    private final int[] price_ssd = {1270,1890,2990};
    private final int[] price_psu = {1990,1490,1390};



    private final double[] perform_cpu = { 3.3, 3.5, 6.2};
    private final double[] perform_ram = { 5200, 5600, 5600};
    private final double[] perform_gpu = { 38575, 31772, 7875};
    private final double[] perform_ssd = { 4000, 5000, 5150};
    private final double[] perform_psu = { 3, 2, 1};


    private final String[] acs = {"HEADSET (หูฟัง) RAZER BLACKSHARK V2 X ", "HEADSET (หูฟัง) ASUS ROG FUSION II 500" , "MOUSE (เมาส์) LOGITECH G PRO-X SUPERLIGHT 2", "MOUSE (เมาส์) LOGITECH USB B100 ", "KEYBOARD (คีย์บอร์ด) LOGITECH G PRO X60", "KEYBOARD (คีย์บอร์ด) LOGITECH G515 LIGHTSPEED TKL","WINDOWS 11 PRO", "MICROSOFT OFFICE HOME & STUDENT 2021"};
    private final int[] price_acs = {1890,6490,5290,129,6590,4590,4990,3490} ;


    //Method get name
    public String getCPU(int index){
        return this.cpu[index];
    }

    public String getRam(int index){
        return this.ram[index];
    }

    public String getGPU(int index){
        return this.gpu[index];
    }

    public String getPSU(int index){
        return this.psu[index];
    }

    public String getSSD(int index){
        return this.ssd[index];
    }

    public String getAcs(int index){
        return this.acs[index];
    }

    //get price
    public int getCPUPrice(int index){
        return this.price_cpu[index];
    }

    public int getRamPrice(int index){
        return this.price_ram[index];
    }

    public int getGPUPrice(int index){
        return this.price_gpu[index];
    }

    public int getPSUPrice(int index){
        return this.price_psu[index];
    }

    public int getSSDPrice(int index){
        return this.price_ssd[index];
    }

    public int getAcsPrice(int index){
        return this.price_acs[index];
    }

    //get performance

    public double getCPUPerform(int index) {
        return this.perform_cpu[index];
    }
    public double getRamPerform(int index){
        return this.perform_ram[index];
    }
    public double getGPUPerform(int index){
        return this.perform_ram[index];
    }
    public double getPSUPerform(int index){
        return this.perform_psu[index];
    }
    public double getSSDPerform(int index){
        return this.perform_ssd[index];
    }



    //print

    public String printCPU() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < cpu.length; i++) {
            result.append((i + 1) + ". " + this.cpu[i] + "\tราคา " + this.price_cpu[i]  + ".-"  + "\n");
        }
        return result.toString();
    }


    public String printRAM(){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < ram.length; i++) {
            result.append((i + 1) + ". " + this.ram[i] + "\tราคา " + this.price_ram[i] + ".-" +  "\n");
        }
        return result.toString();
    }

    public String printGPU(){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < gpu.length; i++) {
            result.append((i + 1) + ". " + this.gpu[i] + "\tราคา " + this.price_gpu[i]  + ".-"  + "\n");
        }
        return result.toString();
    }

    public String printSSD(){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < ssd.length; i++) {
            result.append((i + 1) + ". " + this.ssd[i] + "\tราคา " + this.price_ssd[i]  + ".-"  + "\n");
        }
        return result.toString();
    }

    public String printPSU(){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < psu.length; i++) {
            result.append((i + 1) + ". " + this.psu[i] + "\t\tราคา " + this.price_psu[i]  + ".-"  + "\n");
        }
        return result.toString();
    }

    public String printAcs(){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < acs.length; i++) {
            result.append((i + 1) + ". " + this.acs[i] + "\tราคา " + this.price_acs[i] + ".-" + "\n");
        }
        return result.toString();
    }




}
