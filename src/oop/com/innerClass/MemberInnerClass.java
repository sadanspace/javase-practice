package src.oop.com.innerClass;

/*

成员内部类：
1. 直接可以访问外部类的私有成员变量、成员方法
2. 外部类不能直接访问内部类的成员变量、成员方法
3. 内部类和外部类具有同名变量或方法时，默认先访问内部，此时要想访问外部信息，需要使用"外部类名.this"来调用

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
        private String info = "inner info";
        public void print(){
            System.out.println(info);
            System.out.println(MemberOuter.this.info);
        }
    }

    public void fun(){
        new Inner().print();
    }

    private void memberInfo(){
        System.out.println("memberInfo");
    }
}
