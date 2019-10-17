package src.ReaderOrWriterDemo;

import java.io.CharArrayWriter;

public class CharArrayWriterDemo {
    public static void main(String[] args) {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        charArrayWriter.write(66);
        charArrayWriter.write(67);
        charArrayWriter.write(99);
        System.out.println(charArrayWriter.toString());
        charArrayWriter.close();
    }
}
