package src.oop.com.innerClass;

/*
方法内部类：
1. 类名不能使用访问修饰符、static修饰符
2. 变量名不能使用static修饰符
 */

public class MethodInnerClassTest {
    private String info = "hello world";

    public void function(int temp){
        class Inner{
            private void print(){
                System.out.println("类中的属性："+info);
                System.out.println("方法中的参数"+temp);
            }
        }
        new Inner().print();
    }

    public static void main(String[] args) {
        new MethodInnerClassTest().function(10);
    }
}
