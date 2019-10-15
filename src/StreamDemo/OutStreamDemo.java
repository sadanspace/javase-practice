package src.StreamDemo;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;
import java.nio.ByteBuffer;

public class OutStreamDemo {
    public static void main(String[] args) {
        /**
         * 1. 选择读取或者输入的路径
         * 2. 选择对应的流
         * 3. 选择相应方式处理
         * 4. 关闭流
         */
        String data = "abc \nhello \n#$%";
        String filePath = "src/StreamDemo/output.txt";

        // 方式一
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(filePath);
            for(char d: data.toCharArray()){
                try {
                    outputStream.write(d);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // 方式二
        OutputStream outputStream1 = null;
        InputStream inputData = null;
        String data1 = "hello world";
        try {
            outputStream1 = new FileOutputStream(filePath);
            inputData = new ByteArrayInputStream(data1.getBytes());
            int length = 0;
            byte[] buffer = new byte[1024];
            while(true){
                try {
                    if (!((length = inputData.read(buffer)) != -1)) break;
                    outputStream1.write(buffer, 0, length);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream1.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
