import java.util.Scanner;

public class ArrayDemo {
    public static void main (String[] args){
	int[] arr = {8,4,2,1,23,344,1};
	for(int i=0;i<arr.length;i++){
	    System.out.print(arr[i] + "\t");
	}
	System.out.println();
	
	int sum=0;
	for(int i=0;i<arr.length;i++){
	    sum += arr[i];
	}
	System.out.println("sum:" + sum);

	Scanner sc = new Scanner(System.in);
	System.out.println("请输入一个数字:");
	int inputNum = sc.nextInt();
	boolean flag = false;
	for(int i=0;i<arr.length;i++){
	    if (arr[i] == inputNum){
		System.out.println("arr中包含数字"+inputNum);
		flag = true;
	    }
	}
	if(!flag){
	    System.out.println("arr中不包含数字" + inputNum);
	}
    }
}