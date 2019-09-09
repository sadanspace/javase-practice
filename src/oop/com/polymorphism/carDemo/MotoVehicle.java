package src.oop.com.polymorphism.carDemo;

public abstract class MotoVehicle {
    public String no;
    public String brand;

    public MotoVehicle(){}
    public MotoVehicle(String no, String brand){
        this.no = no;
        this.brand = brand;
    }

    public abstract int calcRent(int days);
}
