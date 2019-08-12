import java.util.Scanner;
import java.lang.Math;


public class GoodLuck {
	public static void main (String[] args) {
		System.out.println("欢迎进入蓝调口琴抽奖系统");
		System.out.println("请输入4位会员号码:");
		Scanner sc = new Scanner(System.in);
		short inNumber = sc.nextShort();
		
		// [0,1)
		short rnd = (short)(Math.random()*10);
		if (rnd == ((inNumber % 100)%10)) {
			System.out.println("恭喜获奖，幸运数字是:" + inNumber);
		} else {
			System.out.println("谢谢支持，数字：" + inNumber);
		};
			
	}
}
