package src.StreamDemo;

import java.io.*;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        InputStream src = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            src = new FileInputStream("src/StreamDemo/input.txt");
            bufferedInputStream = new BufferedInputStream(src);
            try {
                bufferedInputStream.skip(2);
                int word;
                while ((word = bufferedInputStream.read())!=-1){
                    System.out.print((char)word);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                src.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
