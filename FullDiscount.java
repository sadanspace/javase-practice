import java.util.Scanner;

public class FullDiscount {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("付款价格是多少？");
		int price = sc.nextInt();
		System.out.println("是否是会员？(是1，否0）");
		byte isVip = sc.nextByte();

		if (isVip == (byte)1) {
			if (price >= 200) {
				System.out.println("会员满200打7.5折");
			} else if (price >= 100){
				System.out.println("会员满100打8折");
			} 
		}
		else {
			if (price >= 100) {
				System.out.println("顾客满100打9折");
			};
		}
	}
}
