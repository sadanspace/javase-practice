package src.ReaderOrWriterDemo;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderDemo {
    public static void main(String[] args) {
        char[] chars = "你好，charArrayReader".toCharArray();
        CharArrayReader charArrayReader = new CharArrayReader(chars);
        try {
            charArrayReader.skip(1);
            int word;
            while ((word = charArrayReader.read())!=-1){
                System.out.print((char)word);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            charArrayReader.close();
        }
    }
}
