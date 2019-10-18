package src.StreamDemo;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) {
        PrintStream printStream = new PrintStream(System.out);
        printStream.write(123);
        try {
            printStream.write("你好".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        printStream.println(true);
        printStream.println("好");
        printStream.close();

    }
}
