import java.util.Scanner;
import java.lang.String;


public class Administrator {
    public static void main(String[] args) {
	Administrator ad1 = new Administrator();
	ad1.introduce();
	
	TestAdministrator testAd1 = new TestAdministrator();
	testAd1.introduce();

	System.out.println("修改密码");
	Scanner sc = new Scanner(System.in);

	while (true){
	    System.out.println("请输入用户名:");
	    String name = sc.nextLine();
	    System.out.println("请输入密码:");
	    String pwd = sc.nextLine();
	    
	    if (ad1.name.equals(name) && ad1.password.equals(pwd)) {
		System.out.println("验证通过，请输入新密码:");
		String newPwd = sc.nextLine();
		ad1.password = newPwd;
		ad1.introduce();
		break;
	    }
	    System.out.println("验证失败，请重新输入");
	    System.out.println();
	}
    }
    
    String name = "admin";
    String password = "123";
    
    public void introduce() {
	System.out.println("我的名字是:" + name);
	System.out.println("密码是:" + password);
    }
}


class TestAdministrator {
    String name = "testAdmin";
    
    public void introduce() {
	System.out.println("我的名字是：" + name);
    }
}