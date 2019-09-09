/*
某公司要开发新游戏，请用面向对象的思想，设计游戏中的蛇怪和蜈蚣精
设定
1)蛇怪类:
属性包括：怪物名字，生命值，攻击力
方法包括：攻击，移动（曲线移动），补血（当生命值<10时，可以补加20生命值）
2)蜈蚣精类：
属性包括：怪物名字，生命值，攻击力
方法包括：攻击，移动（飞行移动）
要求
1)分析蛇怪和蜈蚣精的公共成员，提取出父类—怪物类
2)利用继承机制，实现蛇怪类和蜈蚣精类
3)攻击方法，描述攻击状态。内容包括怪物名字，生命值，攻击力
4)编写测试类，分别测试蛇怪和蜈蚣精的对象及相关方法
5)定义名为mon的包存怪物类，蛇怪类，蜈蚣精类和测试类
运行效果

怪物蛇怪甲展开攻击
当前生命值是: 5.0
当前攻击力是: 20.0
实施大蛇补血术......, 当前生命值是: 25.0
我是蛇怪,我走S型路线
怪物蜈蚣乙展开攻击
当前生命值是:60.0
当前攻击力是:15.0
我是蜈蚣精，御风飞行
*/

package oop.com.inherit.mon;


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

    public static void main(String[] args){
	Basilisk b = new Basilisk("甲", 5, 20);
	b.attack();
	b.addBlood();
	b.move();
	Essence e = new Essence("乙", 60, 15);
	e.attack();
	e.move();
    }
}


class Basilisk extends Monster{
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


class Essence extends Monster{
    public Essence(){

    }
    
    public Essence(String name, double lifeValue, double attackPower){
	super(name, lifeValue, attackPower);
    }

    @Override
    public void attack(){
	System.out.println("怪物蜈蚣"+super.getName()+"展开攻击");
	System.out.println("当前生命值是:"+super.getLifeValue());
	System.out.println("当前攻击力是:"+super.getAttackPower());
    }
    
    @Override
    public void move(){
	System.out.println("我是蜈蚣精，御风飞行");
    }
}