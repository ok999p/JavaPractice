package JavaClass.MiniProject;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Database db = new Database();
        ComCustom com = new ComCustom();
        Accessories acs = new Accessories();
        More more = new More();
        Order or = new Order();


        int choicemenu;

        System.out.println("====================================");
        System.out.println("\nยินดีต้องรับสู่ร้าน COMPUTER SHOP");
        System.out.println("1.Buy Computer");
        System.out.println("2.Buy Assicories");
        System.out.print("Choose your menu : ");
        switch (choicemenu  = sc.nextInt()){
            case 1:
                com = buyComputer(choicemenu,com);
                break;

            //case 2 chose accessories
            case 2:
                more = buyMore(choicemenu,more);
                break;
            default:
                System.out.println("กรุณาเลือกเมนูใหม่");
                break;
        }
        switch (choicemenu){
            case 1:
                System.out.println(com.toString());
                break;
            case 2:
                System.out.println(more.toString());
                break;
            default: System.out.println("Something Wrong");
        }
    }

    public static ComCustom buyComputer(int choicemenu, ComCustom com){
        Scanner sc = new Scanner(System.in);
        Database db = new Database();
        int choicebuy, choicecompare,changeDevice;
        CPU cpu = new CPU();
        Ram ram = new Ram();
        GPU gpu = new GPU();
        SSD ssd = new SSD();
        PSU psu = new PSU();
        System.out.println("====================================");
        System.out.println("Chose your CPU\n" + db.printCPU());
        System.out.print("Enter Number You want : ");
        switch (choicebuy = sc.nextInt()){
            case 1: cpu = new CPU(db.getCPU(0),db.getCPUPrice(0),db.getCPUPerform(0));
                break;
            case 2: cpu = new CPU(db.getCPU(1),db.getCPUPrice(1),db.getCPUPerform(1));
                break;
            case 3: cpu = new CPU(db.getCPU(2),db.getCPUPrice(2),db.getCPUPerform(2));
                break;
        }
        System.out.print("You want to compare device ? [input num of device or 0 to exit] : ");
        switch (choicecompare = sc.nextInt()){
            case 1: if(cpu.compareTo(db.getCPUPerform(0)) == 1) {
                System.out.println("Your CPU Greater than");
                break;
            }
            else if(cpu.compareTo(db.getCPUPerform(0)) == 0) {
                System.out.println("Your CPU Equal performance");
                break;
            }
            else {
                System.out.println("Your CPU Less than");
                break;

            }
            case 2:if(cpu.compareTo(db.getCPUPerform(1)) == 1)
                System.out.println("Your CPU Greater than");
            else if(cpu.compareTo(db.getCPUPerform(1)) == 0)
                System.out.println("Your CPU Equal performance");
            else
                System.out.println("Your CPU Less than");
                break;

            case 3:if(cpu.compareTo(db.getCPUPerform(2)) == 1)
                System.out.println("Your CPU Greater than");
            else if(cpu.compareTo(db.getCPUPerform(2)) == 0)
                System.out.println("Your CPU Equal performance");
            else
                System.out.println("Your CPU Less than");
                break;
            default: break;
        }
        System.out.print("Confirm your CPU or Change (0 to confirm | num of CPU to Change) :");
        changeDevice = sc.nextInt();
        if(changeDevice != 0){
            cpu.changeCPU(db.getCPU(changeDevice-1),db.getCPUPrice(changeDevice-1),db.getCPUPerform(changeDevice-1));
        }


        //เลือก RAM
        System.out.println("====================================");
        System.out.println("Chose your RAM\n" + db.printRAM());
        System.out.print("Enter Number You want : ");
        switch (choicebuy = sc.nextInt()){
            case 1: ram = new Ram(db.getRam(0),db.getRamPrice(0),db.getRamPerform(0));
                break;
            case 2 : ram = new Ram(db.getRam(1),db.getRamPrice(1),db.getRamPerform(1));
                break;
            case 3: ram = new Ram(db.getRam(2),db.getRamPrice(2),db.getRamPerform(2));
                break;
        }
        System.out.print("You want to compare device ? [input num of device or 0 to exit] : ");
        switch (choicecompare = sc.nextInt()) {
            case 1:
                if (ram.compareTo(db.getRamPerform(0)) == 1) {
                    System.out.println("Your RAM Greater than");
                    break;
                } else if (ram.compareTo(db.getRamPerform(0)) == 0) {
                    System.out.println("Your RAM Equal performance");
                    break;
                } else {
                    System.out.println("Your RAM Less than");
                    break;
                }

            case 2:
                if (ram.compareTo(db.getRamPerform(1)) == 1) {
                    System.out.println("Your RAM Greater than");
                    break;
                } else if (ram.compareTo(db.getRamPerform(1)) == 0) {
                    System.out.println("Your RAM Equal performance");
                    break;
                } else {
                    System.out.println("Your RAM Less than");
                    break;
                }

            case 3:if(ram.compareTo(db.getRamPerform(2)) == 1) {
                System.out.println("Your RAM Greater than");
                break;
            }
            else if(ram.compareTo(db.getRamPerform(2)) == 0) {
                System.out.println("Your RAM Equal performance");
                break;
            }
            else {
                System.out.println("Your RAM Less than");
                break;
            }
            default: break;
        }
        System.out.print("Confirm your RAM or Change (0 to confirm | num of RAM to Change) :");
        changeDevice = sc.nextInt();
        if(changeDevice != 0){
            ram.changeRam(db.getRam(changeDevice-1), db.getRamPrice(changeDevice-1), (int)db.getRamPerform(changeDevice-1));
        }


        //เลือก GPU
        System.out.println("====================================");
        System.out.println("Chose your GPU\n" + db.printGPU());
        System.out.print("Enter Number You want : ");
        switch (choicebuy = sc.nextInt()){
            case 1: gpu = new GPU(db.getGPU(0),db.getGPUPrice(0),db.getGPUPerform(0));
                break;
            case 2: gpu = new GPU(db.getGPU(1),db.getGPUPrice(1),db.getGPUPerform(1));
                break;
            case 3: gpu = new GPU(db.getGPU(2),db.getGPUPrice(2),db.getGPUPerform(2));
                break;
        }
        System.out.print("You want to compare device ? [input num of device or 0 to exit] : ");
        switch (choicecompare = sc.nextInt()){
            case 1: if(gpu.compareTo(db.getGPUPerform(0)) == 1) {
                System.out.println("Your GPU Greater than");
                break;
            }
            else if(gpu.compareTo(db.getGPUPerform(0)) == 0) {
                System.out.println("Your GPU Equal performance");
                break;
            }
            else{
                System.out.println("Your GPU Less than");
                break;
            }
            case 2:if(gpu.compareTo(db.getGPUPerform(1)) == 1) {
                System.out.println("Your GPU Greater than");
                break;
            }
            else if(gpu.compareTo(db.getGPUPerform(1)) == 0) {
                System.out.println("Your GPU Equal performance");
                break;
            }
            else {
                System.out.println("Your GPU Less than");
                break;
            }
            case 3:if(gpu.compareTo(db.getGPUPerform(2)) == 1) {
                System.out.println("Your GPU Greater than");
                break;
            }
            else if(gpu.compareTo(db.getGPUPerform(2)) == 0) {
                System.out.println("Your GPU Equal performance");
                break;
            }
            else {
                System.out.println("Your GPU Less than");
                break;
            }
            default: break;
        }
        System.out.print("Confirm your GPU or Change (0 to confirm | num of GPU to Change) :");
        changeDevice = sc.nextInt();
        if(changeDevice != 0){
            gpu.changeGPU(db.getGPU(changeDevice-1),db.getGPUPrice(changeDevice-1),db.getGPUPerform(changeDevice-1));
        }


        //เลือก SSD
        System.out.println("====================================");
        System.out.println("Chose your Storage\n" + db.printSSD());
        System.out.print("Enter Number You want : ");
        switch (choicebuy = sc.nextInt()){
            case 1: ssd = new SSD(db.getSSD(0),db.getSSDPrice(0),db.getSSDPerform(0));
                break;
            case 2: ssd = new SSD(db.getSSD(1),db.getSSDPrice(1),db.getSSDPerform(1));
                break;
            case 3: ssd = new SSD(db.getSSD(2),db.getSSDPrice(2),db.getSSDPerform(2));
                break;
        }
        System.out.print("You want to compare device ? [input num of device or 0 to exit] : ");
        switch (choicecompare = sc.nextInt()){
            case 1: if(ssd.compareTo(db.getSSDPerform(0)) == 1) {
                System.out.println("Your Storage Greater than");
                break;
            }
            else if(ssd.compareTo(db.getSSDPerform(0)) == 0) {
                System.out.println("Your Storage Equal performance");
                break;
            }
            else{
                System.out.println("Your Storage Less than");
                break;
            }
            case 2:if(ssd.compareTo(db.getSSDPerform(1)) == 1) {
                System.out.println("Your Storage Greater than");
                break;
            }
            else if(ssd.compareTo(db.getSSDPerform(1)) == 0) {
                System.out.println("Your Storage Equal performance");
                break;
            }
            else {
                System.out.println("Your Storage Less than");
                break;
            }

            case 3:if(ssd.compareTo(db.getSSDPerform(2)) == 1) {
                System.out.println("Your Storage Greater than");
                break;
            }
            else if(ssd.compareTo(db.getSSDPerform(2)) == 0) {
                System.out.println("Your Storage Equal performance");
                break;
            }
            else {
                System.out.println("Your Storage Less than");
                break;
            }
            default: break;
        }
        System.out.print("Confirm your Storage or Change (0 to confirm | num of Storage to Change) :");
        changeDevice = sc.nextInt();
        if(changeDevice != 0){
            ssd.changeSSD(db.getSSD(changeDevice-1),db.getSSDPrice(changeDevice-1),(int)db.getSSDPerform(changeDevice-1));
        }

        //เลือก PowerSupply
        System.out.println("====================================");
        System.out.println("Chose your PowerSupply\n" + db.printPSU());
        System.out.print("Enter Number You want : ");
        switch (choicebuy = sc.nextInt()) {
            case 1:
                psu = new PSU(db.getPSU(0),db.getPSUPrice(0),db.getPSUPerform(0));
                break;
            case 2:
                psu = new PSU(db.getPSU(1),db.getPSUPrice(1),db.getPSUPerform(1));
                break;
            case 3:
                psu = new PSU(db.getPSU(2),db.getPSUPrice(2),db.getPSUPerform(2));
                break;
        }

        System.out.print("You want to compare device ? [input num of device or 0 to exit] : ");
        switch (choicecompare = sc.nextInt()){
            case 1: if(psu.compareTo(db.getPSUPerform(0)) == 1) {
                System.out.println("Your Powersupply Greater than");
                break;
            }
            else if(psu.compareTo(db.getPSUPerform(0)) == 0) {
                System.out.println("Your Powersupply Equal performance");
                break;
            }
            else{
                System.out.println("Your Powersupply Less than");
                break;
            }
            case 2:if(psu.compareTo(db.getPSUPerform(1)) == 1) {
                System.out.println("Your Powersupply Greater than");
                break;
            }
            else if(psu.compareTo(db.getPSUPerform(1)) == 0) {
                System.out.println("Your Powersupply Equal performance");
                break;
            }
            else {
                System.out.println("Your Powersupply Less than");
                break;
            }
            case 3:if(psu.compareTo(db.getPSUPerform(2)) == 1) {
                System.out.println("Your Powersupply Greater than");
                break;
            }
            else if(psu.compareTo(db.getPSUPerform(2)) == 0) {
                System.out.println("Your Powersupply Equal performance");
                break;
            }
            else {
                System.out.println("Your Powersupply Less than");
                break;
            }
            default: break;
        }
        System.out.print("Confirm your Powersupply or Change (0 to confirm | num of Powersupply to Change) :");
        changeDevice = sc.nextInt();
        if(changeDevice != 0){
            psu.changePSU(db.getPSU(changeDevice-1),db.getPSUPrice(changeDevice-1),db.getPSUPerform(changeDevice-1));
        }
        com = new ComCustom(cpu, ram, gpu, ssd, psu);
        return com;
    }

    public static More buyMore(int choicemenu, More more){
        Scanner sc = new Scanner(System.in);
        Database db = new Database();
        int input = -1;
        System.out.println("Chose Your Accessories and Software");
        System.out.println(db.printAcs());
        System.out.print("Enter Number You want : ");
        input = sc.nextInt();
        while (input != 0) {
            more.addAcs(new Accessories(db.getAcs(input-1),db.getAcsPrice(input-1)));
            System.out.print("Enter Number You want more [Exit press 0] : ");
            input = sc.nextInt();
        }
        return more;
    }
}
