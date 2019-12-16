/**
 * 什么是ThreadLocal
 * 线程自己的独立内存空间
 */
package c_022_RefTypeAndThreadLocal;

import java.util.concurrent.TimeUnit;

public class ThreadLocal2 {
    static ThreadLocal tl = new ThreadLocal();

    public static void main(String[] args) {
        new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(tl.get());
        }).start();

        new Thread(()->{
            tl.set("new");
            System.out.println("set succeed");
        }).start();
    }
}
