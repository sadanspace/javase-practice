package c_022_RefTypeAndThreadLocal;

import java.io.IOException;

public class T01_StrongReference {
    public static void main(String[] args) {
        M m = new M();
        m = null;
        System.gc();

        try {
            System.in.read();  // 模拟阻塞
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
