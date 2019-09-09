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
            System.out.println("16座以上的价格：" + days*1500);
            return days*1500;
        }else{
            System.out.println("16座以下的价格：" + days*800);
            return days*800;
        }
    }
}
