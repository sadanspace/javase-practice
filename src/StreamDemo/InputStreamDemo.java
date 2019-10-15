package src.StreamDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {
    public static void main(String[] args) {

        String filePath = "src/StreamDemo/input.txt";

        // 方式一
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(filePath);
            int word = inputStream.read();
            System.out.println((char)word);

            while ((word=inputStream.read())!=-1){
                System.out.println((char)word);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("----------------");

        // 方式二
        InputStream inputStream1 = null;
        try {
            inputStream1 = new FileInputStream(filePath);
            byte[] buffer = new byte[1024];
            int length = 0;

            try {
                while((length = inputStream1.read(buffer))!=-1)
                {
                    System.out.println(new String(buffer, 0, length));
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        System.out.println("----------------");

        // 方式三
        InputStream inputStream2 = null;
        try {
            inputStream2 = new FileInputStream(filePath);
            byte[] buffer2 = new byte[1024];
            int length2 = 0;
            try {
                while ((length2 = inputStream2.read(buffer2, 5, 3)) != -1)
                {
                    System.out.println(new String(buffer2, 5, length2));
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
