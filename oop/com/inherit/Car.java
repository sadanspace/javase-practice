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

    public static void main(String[] args){
	Car c = new Car();
	c.start();
	c.stop();
	Taxi t = new Taxi();
	t.start();
	t.stop();
	FamilyCar fc = new FamilyCar();
	fc.start();
	fc.stop();
    }
}


class Taxi extends Car{
    private String company;
    
    public Taxi(){

    }

    public Taxi(String shape, String licensePlate, String company){
	super(shape, licensePlate);
	this.company = company;
    }
    
    @Override
	public void start(){
	System.out.println("Taxi is run...");
    }
    
    @Override
	public void stop(){
	System.out.println("Taxi is stop...");
    }
}


class FamilyCar extends Car{
    private String ownerName;

    public FamilyCar(){

    }
    
    public FamilyCar(String shape, String licensePlate, String ownerName){
	super(shape, licensePlate);
	this.ownerName = ownerName;
    }

    @Override
    public void start(){
	System.out.println("my familyCar is run...");
    }
    
    @Override
    public void stop(){
	System.out.println("my familyCar is stop...");
    }
    
}