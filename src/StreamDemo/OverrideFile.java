package src.StreamDemo;

import java.io.*;

public class OverrideFile {
    public static void main(String[] args) {
        String inFilePath = "src/StreamDemo/input.txt";
        String outFilePath = "src/StreamDemo/output.txt";

        InputStream inputStream = null;
        OutputStream outputStream = null;
        int length = 0;
        try {
            inputStream = new FileInputStream(inFilePath);
            byte[] buffer = new byte[1024];
            while (true){
                try {
                    if (!((length = inputStream.read(buffer)) != -1)) break;
                    outputStream = new FileOutputStream(outFilePath);
                    outputStream.write(buffer, 0, length);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
