/*
编写应用程序，创建类的对象，分别设置圆的半径、圆柱体的高，计算并分别显示圆半径、圆面积、圆周长，圆柱体的体积。
*/

import java.lang.Math;

public class Circle {
    private double radius;
    private double area;
    private double perimeter;

    public Circle(){}

    public Circle(double radius){
	this.radius = radius;
    }

    public double getArea(){
	return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
	return 2 * Math.PI * this.radius;
    }
    
    public static void main(String[] args){
	Circle c = new Circle(3);
	c.show();
	Cilinder cld = new Cilinder(2, 2);
	cld.show();
    }

    public void show(){
	System.out.println("radius: "+this.radius+" area: "+this.getArea()+" perimeter: "+this.getPerimeter());
    }
}


class Cilinder{
    private double hight;
    private double radius;

    public Cilinder() {

    }

    public Cilinder(double hight, double radius){
	this.hight = hight;
	this.radius = radius;
    }
    
    public double getVolume(){
	return this.hight * this.radius * Math.PI;
    }

    public void show(){
	System.out.println("volume: " + this.getVolume());
    }
}