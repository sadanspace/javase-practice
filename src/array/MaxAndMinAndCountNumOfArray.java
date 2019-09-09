/*

获取数组最大值和最小值操作：利用Java的Math类的random()方法，编写函数得到0到n之间的随机数，n是参数。
并找出产生50个这样的随机数中最大的、最小的数，并统计其中>=60的有多少个。
提示：使用 int num=(int)(n*Math.random());获取随机数
*/
import java.lang.Math;
import java.util.Arrays;


public class MaxAndMinAndCountNumOfArray{
    public static void main(String[] args) {
	int num=(int)(50*Math.random());
	int[] nums = new int[50];
	
	int n = 100;
	int count = 0;
	for(int i=0;i<nums.length;i++){
	    nums[i] = (int)(100*Math.random());
	    if (nums[i] >= 60){
		count += 1;
	    }
	}
	Arrays.sort(nums);
	System.out.println("大于60的数有"+count+"个");
	System.out.println("最大值是:"+nums[50-1]);
	System.out.println("最小值是:"+nums[0]);
    }
}