package src.oop.com.innerClass;

/*
匿名内部类:
1. 不能定义构造方法，因为没有名字
2. 匿名类可以是接口的实现，也可以是类的继承
3. 实现接口的匿名内部类时，不能有构造方法

 */

public class AnonymousInnerClassTest {
   interface HelloWorld {
       public abstract void greet();
       public abstract void greetSomeone(String someone);
   }

   public void sayHello(){
       class EnglishGreeting implements HelloWorld {
           String name = "hello world";
           public void greet(){
               greetSomeone("World");
           }

           public void greetSomeone(String someone){
                name = someone;
                System.out.println("Hello "+someone);
           }
       }

       HelloWorld englishGreeting = new EnglishGreeting();
       englishGreeting.greet();

       HelloWorld chineseGreeting = new HelloWorld(){
           String name = "你好世界";

           @Override
           public void greet() {
                greetSomeone("世界");
           }

           @Override
           public void greetSomeone(String someone) {
                name = someone;
                System.out.println("你好 "+"世界");
           }
       };
       chineseGreeting.greet();

    }


    public static void main(String[] args) {
        AnonymousInnerClassTest app = new AnonymousInnerClassTest();
        app.sayHello();
    }
}
