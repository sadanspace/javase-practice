package src.TreadDemo;

public class SleepTest {
    public static void main(String[] args) {
        MyRun myRun = new MyRun();
        Thread thread = new Thread(myRun);
        thread.start();
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"------"+i);
            if(i==3){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
