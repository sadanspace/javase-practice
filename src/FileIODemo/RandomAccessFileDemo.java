package src.FileIODemo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    public static void main(String[] args) {
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile("src/FileIODemo/file.txt", "rw");
            randomAccessFile.writeUTF("好了");
            randomAccessFile.seek(0);
            System.out.println(randomAccessFile.getFilePointer());
            System.out.println(randomAccessFile.readUTF());
            randomAccessFile.seek(0);
            System.out.println(randomAccessFile.getFilePointer());
            System.out.println(randomAccessFile.readUTF());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
