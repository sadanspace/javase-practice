package src.oop.com.polymorphism.carDemo;

public class Calc {
    public int calcPriceByMotoVehicle(MotoVehicle motoVehicle, int days) {
        return motoVehicle.calcRent(days);
    }

    public int calcTotalRent(MotoVehicle[] motos, int days){
        int sum = 0;
        for(int i=0;i<motos.length;i++){
            sum += motos[i].calcRent(days);
        }
        return sum;
    }
}
