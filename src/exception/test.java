package src.exception;

public class test {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        } catch (ArithmeticException e){
            System.out.println("ArithmeticException");
            e.printStackTrace(); // 获取栈跟踪的信息
            System.out.println(e.getMessage());  // 获取异常信息
            throw e;
        }
         catch (Exception e) {
             System.out.println("Exception");
            e.printStackTrace(); // 获取栈跟踪的信息
            System.out.println(e.getMessage());  // 获取异常信息
        }
    }
}
