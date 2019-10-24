package src.TreadDemo;

public class AlternationPrint {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Thread threadA = new Thread(a);
        Thread threadB = new Thread(b);
        threadA.start();
        threadB.start();
    }
}


class A implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<11;i++){
            System.out.println(Thread.currentThread().getName() + "----" + i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable{
    @Override
    public void run(){
        for(int i=10;i>0;i--){
            System.out.println(Thread.currentThread().getName() + "----" + i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}