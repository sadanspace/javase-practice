import java.util.Scanner;

public class AutoCall {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入拨号数字(1-4)：");
		byte num = sc.nextByte();
		
		switch(num) {
			case 1:
				System.out.println("给爸爸拨号");
				break;
			case 2:
				System.out.println("给妈妈拨号");
				break;
			case 3:
				System.out.println("给爷爷拨号");
				break;
			case 4:
				System.out.println("给奶奶拨号");
				break;
			default:
				System.out.println("输入无效，请输入1-4");
		}
	}
}
