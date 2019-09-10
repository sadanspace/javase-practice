package src.oop.com.polymorphism.carDemo;

public class Truck extends MotoVehicle {
    private int tonnage;

    public Truck(){

    }

    public Truck(String no, String brand, int tonnage){
        super(no, brand);
        this.tonnage = tonnage;
    }

    @Override
    public int calcRent(int days){
        return 50*this.tonnage*days;
    }
}
