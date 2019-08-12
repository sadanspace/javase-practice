import java.util.Scanner;
import java.lang.String;

public class AddCust {
	public static void main(String[] args) {
		System.out.println("欢迎登陆蓝调口琴会员系统");
		System.out.println("添加会员信息");
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入会员号<4位整数>:");
		String vipNumber = sc.nextLine();
		System.out.println("请输入会员生日(月/日<2位整数>):");
		String vipBirthday = sc.nextLine();
		System.out.println("请输入积分<整数>:");
		int vipScore = sc.nextInt();
		
		if(!(vipNumber.matches("\\d{4}")) ) {
			System.out.println("无效的会员号：" + vipNumber);
			System.out.println("录入信息失败");
		} else if(!(vipBirthday.matches("\\d{2}\\/\\d{2}"))) {
			System.out.println("无效的会员号：" + vipBirthday);
		} else {
			System.out.println("已录入的会员信息是:");
			System.out.println(vipNumber+"\t"+vipBirthday+"\t"+vipScore);
		};
	}
}
