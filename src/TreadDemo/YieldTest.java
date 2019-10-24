package src.TreadDemo;

public class YieldTest {
    public static void main(String[] args) {
        MyRun myRun = new MyRun();
        Thread thread = new Thread(myRun);
        thread.start();

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                Thread.yield();
                System.out.println(Thread.currentThread().getName() + "-------" + i + "跳过此次抢占");
            } else {
                System.out.println(Thread.currentThread().getName() + "--------" + i);
            }
        }
    }
}
