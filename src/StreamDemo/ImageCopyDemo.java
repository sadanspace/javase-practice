package src.StreamDemo;

import java.io.*;

public class ImageCopyDemo {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            fileInputStream = new FileInputStream("src/StreamDemo/shining-circle.jpg");
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            fileOutputStream = new FileOutputStream("src/StreamDemo/shining-circle-bak.jpg");
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            byte[] buffer = new byte[1024];
            int length;
            try {
                while ((length = bufferedInputStream.read(buffer))!=-1){
                    bufferedOutputStream.write(buffer);
                }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    bufferedOutputStream.close();
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
