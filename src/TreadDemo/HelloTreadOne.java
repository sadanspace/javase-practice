package src.TreadDemo;

/**
 * First implementation Thread
 */
public class HelloTreadOne extends Thread {

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        HelloTreadOne helloTreadOne = new HelloTreadOne();
        // Thread-0
        helloTreadOne.start();
        // main thread
        System.out.println(Thread.currentThread().getName());
    }
}

