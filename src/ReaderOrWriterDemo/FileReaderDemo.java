package src.ReaderOrWriterDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderDemo {
    public static void main(String[] args) {
        Reader reader = null;
        try {
            reader = new FileReader("src/ReaderOrWriterDemo/reader.txt");
            try {
                char[] buffer = new char[1024];
                reader.skip(1);
                int length;
                while ((length = reader.read(buffer)) != -1){
                    System.out.println(new String(buffer, 0, length));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
