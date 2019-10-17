package src.StreamDemo;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        String src = "hello";

        ByteArrayInputStream inputStream = new ByteArrayInputStream(src.getBytes());
        int word = inputStream.read();
        System.out.println((char)word);
        System.out.println((char)inputStream.read());
        inputStream.skip(2);
        System.out.println((char)inputStream.read());
        try {
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
