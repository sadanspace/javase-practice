public class Car{
    String shape;
    String licensePlate;

    public Car(){}
    
    public Car(String shape, String licensePlate){
	this.shape = shape;
	this.licensePlate = licensePlate;
    }

    public void start(){
	System.out.println("car is running...");
    }
    public void stop(){
	System.out.println("car is stoped");
    }
}
