package src.ReaderOrWriterDemo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterDemo {
    public static void main(String[] args) {
        Writer writer = null;
        try {
            writer = new FileWriter("src/ReaderOrWriterDemo/writer.txt");
            writer.write("你好，Writer ");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
