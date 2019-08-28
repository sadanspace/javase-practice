package car;

public class Taxi extends Car{
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

    public static void main(String[] args){
	Taxi t = new Taxi("敞篷车", "宝马xxx", "宝马");
	t.start();
	t.stop();
    }
}