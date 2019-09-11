package src.oop.com.interface_demo;

public class Computer implements Cpu, Memory, Disk {
    static int mainFrequency = 33;
    static String brand = "Intel";
    static int mSize = 4;
    static int dSize = 512;

    public Computer(){

    }

    @Override
    public void count(){
        System.out.println("cpu计算");
    }

    @Override
    public void tmpStorage(){
        System.out.println("内存暂存");
    }

    @Override
    public void permanentStorage(){
        System.out.println("硬盘永存");
    }

    public void info(){
        System.out.println("计算机信息如下：");
        System.out.println("CPU品牌是："+Computer.brand+" ,"+"主频是："+Computer.mainFrequency);
        System.out.println("硬盘容量是："+Computer.dSize);
        System.out.println("内存容量是："+Computer.mSize);
    }
}
