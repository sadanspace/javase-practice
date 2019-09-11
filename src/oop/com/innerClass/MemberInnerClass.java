package src.oop.com.innerClass;

/*

成员内部类：
1. 直接可以访问外部类的私有成员变量、成员方法
2. 外部类不能直接访问内部类的成员变量、成员方法

*/

public class MemberInnerClass {
    public static void main(String[] args) {
        MemberOuter memberOuter = new MemberOuter();
        memberOuter.fun();
    }

}

class MemberOuter{
    private String info="hello world";
    class Inner{
        public void print(){
            System.out.println(info);
            memberInfo();
        }
    }

    public void fun(){
        new Inner().print();
    }

    private void memberInfo(){
        System.out.println("memberInfo");
    }
}
