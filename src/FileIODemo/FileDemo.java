package src.FileIODemo;

import java.io.File;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) {
        File file1 = new File("/Users");
        File[] files = file1.listFiles();
        for(File f: files){
            System.out.println(f);
        }

        System.out.println("------------------");
        File[] testFiles = new File[3];
        testFiles[0] = file1;
        testFiles[1] = new File("fileTest.txt"); // 文件不存在时，也能获取某些属性
        testFiles[2] = new File("FileIODemo/fileTest.txt");

        for(File file: testFiles){
            System.out.println("--------start----------");
            System.out.println(file.getName());
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getPath());
            try {
                System.out.println(file.getCanonicalFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                System.out.println(file.getCanonicalPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(file.getParent());
            System.out.println(file.getFreeSpace());
            System.out.println(file.getTotalSpace());
            System.out.println(file.getUsableSpace());

            System.out.println("------------------");

            System.out.println(file.canExecute());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());

            System.out.println(file.isDirectory());
            System.out.println(file.isFile());
            System.out.println(file.isAbsolute());
            System.out.println(file.isHidden());
            System.out.println(file.exists());

            System.out.println(file.lastModified());

            System.out.println("------------------");

            // 文件分隔符
            System.out.println(File.separator);
            // 路径分隔符
            System.out.println(File.pathSeparator);

            // 列出磁盘的根目录的File对象列表，如果是Windows系统，则是不同分区的目录File对象
            System.out.println(File.listRoots());

            System.out.println("--------end----------");
        }


        // 创建临时文件
//        File tmpFile = null;
//        try {
//            tmpFile = File.createTempFile("pre", "suf");
//            System.out.println(tmpFile.getName());  // pre7798792570841567438suf
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        System.out.println("------------------");

        /*
            显示/Users下所有文件的绝对路径，并统计所有打印的文件数
            使用递归实现

            可能出现问题：
                抛出java.lang.NullPointerException
                当抛出空指针异常时，可能是有些文件没有相应的访问权限所导致，改用一些简单点的目录做测试
         */

//        FileDemo.printFiles(new File("/tmp"));
//        System.out.println(fileCount);
    }

    static int fileCount;

    static public void printFiles(File file){
        if(file.isFile()){
            System.out.println(file.getName());
            fileCount += 1;
        }
        if(file.isDirectory()){
            for(File f :file.listFiles()){
                FileDemo.printFiles(f);
            }
        }
    }
}
