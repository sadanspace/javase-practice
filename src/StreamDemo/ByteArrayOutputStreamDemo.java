package src.StreamDemo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        try {
            outputStream.write("hello ByteArrayOutputStream".getBytes());
            System.out.println(outputStream.toString());
        } catch (IOException e) {
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
