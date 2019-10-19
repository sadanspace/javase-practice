package src.JavaIOExercise;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileReadChunkDemo {
    public static void main(String[] args) {
        /**
         * 使用RandomAccessFile类，使用块作为访问单位，
         * 打印出以下内容：
         *  块的起始位置
         *  块大小
         *  可以切成多少块
         *  当前块所对应的数据
         */


        long beginPos = 0;
        int blockSize = 1024;

        try (
                RandomAccessFile randomAccessFile = new RandomAccessFile("src/JavaIOExercise/read.txt", "rw");
        ) {
            long fileLength = randomAccessFile.length();
            int count = (int)Math.ceil(fileLength*1.0/blockSize);
            System.out.printf("该文件要被切成<<%d>>块", count);
            System.out.println();

            // 实际的块大小，由于最后一个块很可能不是刚好满足blockSize的大小
            byte[] bytes = new byte[blockSize];
            int actualSize = 0;
            for(int i=0;i<count;i++){
                beginPos = i * blockSize;
                if(i==count-1){
                    bytes = new byte[actualSize];
                    actualSize = (int) fileLength;
                } else{
                    actualSize = blockSize;
                    fileLength -= actualSize;
                }
                System.out.println("________________________________________________________");
                System.out.printf("%d, 当前位置为%d, 读取的块大小为%d", i, beginPos, actualSize);
                System.out.println();

                randomAccessFile.seek(beginPos);
                randomAccessFile.read(bytes);
                System.out.println(new String(bytes, 0, actualSize));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
