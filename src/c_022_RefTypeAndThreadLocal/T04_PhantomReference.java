/**
 * 使用此参数限制JVM分配的内存：-Xms<memory> -Xmx<memory>
 *
 *     虚引用，
 */
package c_022_RefTypeAndThreadLocal;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.LinkedList;
import java.util.List;

public class T04_PhantomReference {
    private static final List<Object> LIST = new LinkedList<>();
    private static final ReferenceQueue<M> QUEUE = new ReferenceQueue<>();

    public static void main(String[] args) {
        PhantomReference<M> mPhantomReference = new PhantomReference<>(new M(), QUEUE);

        new Thread(
                () -> {
                    while (true) {
                        LIST.add(new byte[1024*1024]);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(mPhantomReference.get());  // 永远拿不到虚引用指向的对象，之后返回null
                    }
                }
        ).start();

        new Thread(()->{
            while (true) {
                Reference<? extends M> poll = QUEUE.poll();
                if (poll != null) {
                    System.out.println(poll==mPhantomReference);  // 队列中的元素就是虚引用对象
                    System.out.println("-----虚引用对象被JVM回收了--------");
                }
            }
        }).start();
    }
}
