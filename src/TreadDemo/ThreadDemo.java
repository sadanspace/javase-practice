package src.TreadDemo;

public class ThreadDemo implements Runnable {
    @Override
    public void run(){
    }

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        Thread thread = new Thread(threadDemo);
        thread.start();

        // 写
        thread.setName("我是线程");

        // 查
        System.out.println(thread.getName());
        System.out.println(thread.getId());
        System.out.println("Proprity :" + thread.getPriority());
        System.out.println("Thread State :" + thread.getState());
        System.out.println("Thread isAlive: " + thread.isAlive());
        System.out.println("Thread isDaemon: " + thread.isDaemon());
        System.out.println("Thread isInterrupted: " + thread.isInterrupted());


    }
}
