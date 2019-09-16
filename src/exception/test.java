package src.exception;

public class test {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        } catch (Exception e) {
            e.printStackTrace(); // 获取栈跟踪的信息
            System.out.println(e.getMessage());  // 获取异常信息
        }

    }
}
