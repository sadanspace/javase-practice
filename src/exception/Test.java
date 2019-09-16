package src.exception;

public class Test {
    public static void main(String[] args) {
        System.out.println(test().num);

    }

    static public Num test(){
        Num number = new Num();
        try {
            System.out.println("try");
            return number;
        } catch (Exception e){
            System.out.println("Exception");
        } finally {
            if (number.num > 20) {
                System.out.println("num > 20: " + number.num);
            }
            System.out.println("finally");
            number.num = 100;
        }
        System.out.println("out");
        return number;
    }
}


class Num {
    public int num = 10;
}