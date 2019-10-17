package src.StreamDemo;

import java.io.*;

public class DataStreamDemo {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        DataInputStream dataInputStream = null;
        DataOutputStream dataOutputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream("src/StreamDemo/data.txt");
            fileInputStream = new FileInputStream("src/StreamDemo/data.txt");
            dataInputStream = new DataInputStream(fileInputStream);
            dataOutputStream = new DataOutputStream(fileOutputStream);

            try {
                dataOutputStream.writeUTF("你好");
                dataOutputStream.writeInt(123);
                System.out.println(dataInputStream.readUTF());
                System.out.println(dataInputStream.readInt());
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    dataInputStream.close();
                    dataOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
    }

