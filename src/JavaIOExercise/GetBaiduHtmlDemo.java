package src.JavaIOExercise;

import java.io.*;
import java.net.URL;

public class GetBaiduHtmlDemo {
    public static void main(String[] args) {
        try (
                InputStream inputStream = new URL("http://www.baidu.com").openStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                OutputStream outputStream = new FileOutputStream("src/JavaIOExercise/baidu.html");
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        ) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                bufferedWriter.write(line);
                bufferedWriter.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
