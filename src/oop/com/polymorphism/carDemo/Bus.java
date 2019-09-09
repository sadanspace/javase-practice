package src.oop.com.polymorphism.carDemo;


public class Bus extends MotoVehicle{
    private int seatCount;

    public Bus(){

    }

    public Bus(String no, String brand, int seatCount){
        super(no, brand);
        this.seatCount = seatCount;
    }


    @Override
    final public int calcRent(int days){
        if (this.seatCount > 16) {
            return days*1500;
        }else{
            return days*800;
        }
    }
}
