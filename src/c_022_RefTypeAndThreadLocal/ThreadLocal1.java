package c_022_RefTypeAndThreadLocal;

import java.util.concurrent.TimeUnit;

public class ThreadLocal1 {
    static String name = "abc";

    public static void main(String[] args) {
        new Thread(
                () -> {
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("name: " + name);
                }
        ).start();

        new Thread(
                () -> {
                    name = "new name";
                    System.out.println("set new name");
                }
        ).start();
    }
}
