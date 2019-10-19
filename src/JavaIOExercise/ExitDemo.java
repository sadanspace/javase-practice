package src.JavaIOExercise;

import java.io.*;

public class ExitDemo {
    public static void main(String[] args) {
        /**
         * 需求：
         * 终端可以随意输入字符，当一行的输入为exit时，结束该终端
         */

        try (
                InputStreamReader inputStreamReader = new InputStreamReader(System.in);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)
        ) {
            String in = "";
            while (!(in = bufferedReader.readLine()).equals("exit")) {
                bufferedWriter.write(in);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
