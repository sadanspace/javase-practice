package src.oop.com.innerClass;

/*
静态内部类：
1. 静态内部类中只能调用外部类的静态属性和方法
2. 初始化内部类的语法"外部类.内部类 引用名 = new 外部类.内部类()"
 */

public class StaticInnerClass {
    public static void main(String[] args) {
       StaticOuter.Inner inner =  new StaticOuter.Inner();
       inner.info();
    }

}

class StaticOuter{
    private int outer = 1;
    static private int staticOuter = 2;


    static class Inner{
        void info(){
            System.out.println("访问外部类静态属性：" + staticOuter);
//            System.out.println(outer);
            System.out.println("静态内部类");
            outerInfo();
        }
    }

    static void outerInfo(){
        System.out.println("外部类静态方法");
    }
}