/**
 *  使用此参数限制JVM分配的内存：-Xms<memory> -Xmx<memory>
 */
package c_022_RefTypeAndThreadLocal;

import java.lang.ref.SoftReference;

public class T02_SoftReference {
    public static void main(String[] args) {
        SoftReference softReference = new SoftReference(new byte[1024*1024*10]);
        // softReference = null;  // 软引用变为空指针，所指向的对象将被GC回收
        System.out.println(softReference.get());
        System.gc();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(softReference.get());

        // 再分配一个数组，此时heap装不下，系统会进行垃圾回收，将软引用对象回收
        byte[] bytes = new byte[1024 * 1024 * 11];
        System.out.println(softReference.get());

    }
}
