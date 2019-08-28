public class Basilisk extends Monster{
    public Basilisk(){

    }

    public Basilisk(String name, double lifeValue, double attackPower){
	super(name, lifeValue, attackPower);
    }

    @Override
    public void attack(){
	System.out.println("怪物蛇怪"+super.name+"展开攻击");
	System.out.println("当前生命值是: "+super.lifeValue);
	System.out.println("当前攻击力是: "+super.attackPower);
    }

    @Override
    public void move(){
	System.out.println("我是蛇怪,我走S型路线");
    }

    public void addBlood(){
	if(this.lifeValue<=10){
	    this.lifeValue += 20;
	}
	System.out.println("实施大蛇补血术......, 当前生命值是: "+ this.lifeValue);
    }

    public static void main(String[] args){
	Basilisk b = new Basilisk("甲", 10, 20);
	b.attack();
	b.move();
    }
}