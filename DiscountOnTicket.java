import java.util.Scanner;

public class DiscountOnTicket {
	public static void main(String[] args) {
		System.out.println("请输入舱位类型(1|2):");
		Scanner sc = new Scanner(System.in);
		byte ticketType = sc.nextByte();
		System.out.println("请输入月份(1-12):");
		byte month = sc.nextByte();
		
		final int ticketPrice = 5000;

		switch(month) {
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				switch(ticketType) {
					case 1:
						System.out.println("头等舱价格：" + ticketPrice * 0.9);
						break;
					case 2:
						System.out.println("经济舱价格：" + ticketPrice * 0.8);
						break;
				}
				break;
			default:
				switch(ticketType) {
					case 1:
						System.out.println("头等舱价格：" + ticketPrice * 0.5);
						break;
					case 2:
						System.out.println("经济舱价格：" + ticketPrice * 0.4);
						break;
				}
		}
		
	}
}
