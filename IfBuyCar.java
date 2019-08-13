import java.util.Scanner;

public class IfBuyCar {
	public static void main(String[] args) {
		System.out.println("你现在银行有多少万存款？");
		Scanner sc = new Scanner(System.in);
		int deposit = sc.nextInt();
		if (deposit >= 500){
			System.out.println("建议您买凯迪拉克");
		} else if (deposit >= 100) {
			System.out.println("建议您买帕萨特");
		} else if (deposit >= 50) {
			System.out.println("建议您买伊兰特");
		
		} else if (deposit >= 10) {
			System.out.println("建议您买奥拓");
		} else {
			System.out.println("建议您买捷安特");
		};
	}
}
