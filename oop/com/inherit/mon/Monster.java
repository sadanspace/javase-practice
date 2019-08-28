public abstract class Monster{
    String name;
    double lifeValue;
    double attackPower;

    public Monster(){

    }
    
    public Monster(String name, double lifeValue, double attackPower){
	this.name = name;
	this.lifeValue = lifeValue;
	this.attackPower = attackPower;
    }

    public String getName(){
	return this.name;
    }
    
    public void setName(String name){
	this.name = name;
    }
    
    public double getLifeValue(){
	return this.lifeValue;
    }

    public void setLifeValue(double lifeValue){
	this.lifeValue = lifeValue;
    }

    public double getAttackPower(){
	return this.attackPower;
    }

    public void setAttackPower(double attackPower){
	this.attackPower = attackPower;
    }

    public abstract void attack();
    public abstract void move();
}