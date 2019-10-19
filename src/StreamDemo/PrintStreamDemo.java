package src.StreamDemo;

import java.io.*;

public class PrintStreamDemo {
    public static void main(String[] args) {

        try (
                InputStreamReader inputStreamReader = new InputStreamReader(System.in);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                PrintStream printStream = new PrintStream(System.out);
                PrintStream printErrStream = new PrintStream(System.err)
        ) {
            String line = "";
            while (! (line = bufferedReader.readLine()).equals("exit")){
                printStream.printf("Std: %s", line);
                printStream.append("\n");
                printErrStream.printf("Err: %s", line);
                printErrStream.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
