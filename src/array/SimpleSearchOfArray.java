/*


数组查找操作：
定义一个长度为10 的一维字符串数组，在每一个元素存放一个单词；
然后运行时从命令行输入一个单词，程序判断数组是否包含有这个单词，包含这个单词就打印出“Yes”，不包含就打印出“No”。
*/
import java.lang.String;
import java.util.Scanner;


public class SimpleSearchOfArray{
    public static void main(String[] args){
	String[] strItems = new String[]{"word", "pass", "how", "what", "why", "language", "best", "worst", "vue", "babel"};

	System.out.println("请输入单词:");
	Scanner sc = new Scanner(System.in);
	String word = sc.nextLine();

	boolean isIn = false;
	for (int i=0;i<strItems.length;i++){
	    if (strItems[i].equals(word)){
		System.out.println("包含该单词:"+word);
		isIn = true;
		break;
	    }

	}
	if(!isIn){
	    System.out.println("不包含该单词:" + word);
	}
    }

}