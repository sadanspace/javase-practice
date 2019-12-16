package c_022_RefTypeAndThreadLocal;

public class M {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize");  // 用于查看GC回收过程
    }
}
