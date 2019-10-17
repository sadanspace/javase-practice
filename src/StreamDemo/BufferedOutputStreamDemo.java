package src.StreamDemo;

import java.io.*;

public class BufferedOutputStreamDemo {
    public static void main(String[] args) {
        OutputStream outputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            outputStream = new FileOutputStream("src/StreamDemo/output.txt");
            bufferedOutputStream = new BufferedOutputStream(outputStream);
            try {
                bufferedOutputStream.write("你好吗".getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
