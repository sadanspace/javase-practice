import java.util.Scanner;


public class CountScoreAndDiscout {
	public static void main (String[] args) {
		System.out.println("请输入会员积分数:");
		Scanner sc = new Scanner(System.in);
		int vipScore = sc.nextInt();
		
		if (vipScore >= 8000) {
			System.out.println("6折");
		} else if (vipScore >= 4000) {
			System.out.println("7折");
		} else if (vipScore >= 2000) {
			System.out.println("8折");
		} else if (vipScore > 0) {
			System.out.println("9折");
		};
	}
}
