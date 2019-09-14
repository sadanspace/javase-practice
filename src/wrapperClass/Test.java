package src.wrapperClass;

import org.omg.PortableInterceptor.INACTIVE;

public class Test {


    public static void main(String[] args) {
        // 为什么i1==i2是true?
        // 什么时候会进行自动拆箱和装箱？
        // 自动拆箱和装箱分别是什么？
        Integer i1 = new Integer(10);
        int i2 = 10;
        System.out.println(i1 == i2);

        // 拆箱，将包装类对象转换为基本数据类型
        int i3 = i1.intValue();

        // 装箱，将基本数据类型转换为包装类
        Integer i4 = Integer.valueOf(i2);

        System.out.println("--------------------");

        // 请问以下打印的结果是什么？为什么？
        //
        // 以下是装箱的过程，调用Integer.valueOf方法进行转换
        // true 范围在IntegerCache数组之内，返回的是同一个对象，因此引用地址相同
        // false 范围在IntegerCache数组之外，返回的是两个新对象，因此引用地址不同
        Integer a1 = 100;
        Integer a2 = 100;
        Integer a3 = 200;
        Integer a4 = 200;
        System.out.println(a1 == a2);
        System.out.println(a3 == a4);

        System.out.println("--------------------");
        // 请问以下打印的结果是什么？为什么？
        // false、false，因为返回的都是新对象，没有缓存
        Double b1 = 1.1;
        Double b2 = 1.1;
        Double b3 = 200.1;
        Double b4 = 200.1;
        System.out.println( b1 == b2);
        System.out.println( b3 == b4);



    }
}
