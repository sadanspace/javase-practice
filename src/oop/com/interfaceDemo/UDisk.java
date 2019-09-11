package src.oop.com.interface_demo;

public class UDisk implements UsbInterface {
    public UDisk(){

    }


    @Override
    public void service(){
        System.out.println("连接Usb接口，开始数据传输");
    }
}
