package src.oop.com.polymorphism.carDemo;


public class Car extends MotoVehicle{
    private String carType;

    public Car(){

    }

    public Car(String no, String  brand, String carType){
        super(no, brand);
        this.carType = carType;
    }

    @Override
    final public int calcRent(int days){
        if (this.carType.equals("航GL8")){
            System.out.println("航GL8价格：" + 600*days);
            return 600*days;
        } else if (this.carType.equals("550i")){
            System.out.println("550i价格：" + 500*days);
            return 500*days;
        } else if (this.carType.equals("林荫大道")){
            System.out.println("林荫大道价格：" + 300*days);
            return 300*days;
        } else {
            return 0;
        }
    }


}
