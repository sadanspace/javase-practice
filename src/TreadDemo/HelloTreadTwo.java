package src.TreadDemo;

/**
 * Second implementation Thread
 */
public class HelloTreadTwo implements Runnable {

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        HelloTreadOne helloTreadOne = new HelloTreadOne();
        Thread thread = new Thread(helloTreadOne);
        // Thread-1
        thread.start();
        // main thread
        System.out.println(Thread.currentThread().getName());
    }
}
