package src.oop.com.polymorphism.carDemo;

public class Calc {
    public int calcPriceByMotoVehicle(MotoVehicle motoVehicle, int days) {
        return motoVehicle.calcRent(days);
    }
}
