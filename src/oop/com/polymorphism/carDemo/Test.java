package src.oop.com.polymorphism.carDemo;

public class Test {
    public static void main(String[] args) {
        Car c1 = new Car("cc1", "别克", "航GL8");
        Bus b1 = new Bus("bb1", "金杯",17);
        int c1Price = c1.calcRent(2);
        int b1Price = b1.calcRent(3);
        System.out.println(c1Price);
        System.out.println(b1Price);
        }
    }

