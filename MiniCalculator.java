import java.util.Scanner;

public class MiniCalculator {
	public static void main(String[] args) {
	    System.out.println("请输入第一个数:");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
	    System.out.println("请输入第二个数:");
		int num2 = sc.nextInt();
    	System.out.println("请输入操作符(*/+-):");
    	String $_ = sc.nextLine();
    	String numOperator = sc.nextLine();
	
    	switch(numOperator) {
    		case "*":
    			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
				break;
    		case "/":
    			System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
				break;
    		case "+":
    			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
				break;
    		case "-":
    			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
				break;
    	}
	}
}
