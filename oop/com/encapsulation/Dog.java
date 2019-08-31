/*
使用面向对象的思想，编写自定义描述狗的信息。设定属性包括：品种，年龄，心情，名字；方法包括：叫，跑。
要求：
1)设置属性的私有访问权限，通过公有的get,set方法实现对属性的访问
2)限定心情只能有“心情好”和“心情不好”两种情况，如果无效输入进行提示，默认设置“心情好”。
3)设置构造函数实现对属性赋值
4)叫和跑的方法，需要根据心情好坏，描述不同的行为方式。
5)编写测试类，测试狗类的对象及相关方法（测试数据信息自定义）

运行效果:

信息输入错误，这只狗狗今天心情好
名字叫小白的斑点犬心情好开心的围着主人身边转
名字叫小白的斑点犬心情好开心的旺旺叫
-------
名字叫小黑的斑点犬心情不好伤心的一动不动
名字叫小黑的斑点犬心情不好伤心的呜呜叫
*/

public class Dog {

    private String variety;
    private int age;
    private String mood = "心情好";
    private String name;

    public Dog(){

    }

    public Dog(String variety, int age, String mood, String name){
	this.variety = variety;
	this.age = age;
	this.mood = mood;
	this.name = name;
    }

    public String getVariety(){
	return this.variety;
    }

    public void setVariety(String variety){
	this.variety = variety;
    }

    public int getAge(){
	return this.age;
    }

    public void setAge(int age){
	this.age = age;
    }

    public String getMood(){
	return this.mood;
    }

    public void setMood(String mood){
	if(mood.equals("心情好") || mood.equals("心情不好")){
		this.mood = mood;	    
	    }else {
		System.out.println("信息输入错误，这只狗狗今天"+this.mood);
	    }

	
    }

    public String getName(){
	return this.name;
    }

    public void setName(String name){
	this.name = name;
    }

    public void shout(){
	if(this.mood.equals("心情好")){
	    System.out.println("名字叫"+this.name+"的"+this.variety+this.mood+"开心的围着主人身边转");
	}else if(this.mood.equals("心情不好")){
		System.out.println("名字叫"+this.name+"的"+this.variety+this.mood+"伤心的一动不动");
	    }
    }

    public void run(){
	if(this.mood.equals("心情好")){
	    System.out.println("名字叫"+this.name+"的"+this.variety+this.mood+"开心的旺旺叫");
	}else if(this.mood.equals("心情不好")){
		System.out.println("名字叫"+this.name+"的"+this.variety+this.mood+"伤心的呜呜叫");
	    }
    }

   public static void main(String[] args){
	Dog d = new Dog();
	d.setAge(3);
	d.setName("小白");
	d.setVariety("斑点犬");
	d.setMood("心情糟糕");
	d.shout();
	d.run();
	
	System.out.println("-------");
	Dog d1 = new Dog();
	d1.setAge(2);
	d1.setName("小黑");
	d1.setVariety("斑点犬");
	d1.setMood("心情不好");
	d1.shout();
	d1.run();
    }
}