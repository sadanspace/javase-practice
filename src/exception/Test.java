package src.exception;

public class Test {
    public static void main(String[] args) {
        System.out.println(test());

    }

    static public int test(){
        int num = 10;
        try {
            System.out.println("try");
            return num += 80;  // 等效于 num+=80;return num
        } catch (Exception e){
            System.out.println("Exception");
        } finally {
            if (num > 20) {
                System.out.println("num > 20: " + num);
            }
            System.out.println("finally");
            num = 100;
        }
        return num;
    }
}
