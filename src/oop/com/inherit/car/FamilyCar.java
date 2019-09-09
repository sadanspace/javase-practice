package oop.com.inherit.car;

public class FamilyCar{
    private String shape;
    private String licensePlate;
    private String ownerName;

    public FamilyCar(){

    }
    
    public FamilyCar(String shape, String licensePlate, String ownerName){
	this.shape = shape;
	this.licensePlate = licensePlate;
	this.ownerName = ownerName;
    }

    public void start(){
	System.out.println("my familyCar is run...");
    }

    public void stop(){
	System.out.println("my familyCar is stop...");
    }
    
    public static void main(String[] args){
	FamilyCar fc = new FamilyCar();
	fc.start();
	fc.stop();
    }
}