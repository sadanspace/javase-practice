/*
数组逆序操作：定义长度为10的数组，将数组元素对调，并输出对调前后的结果。
 */


public class ReverseOrder{
    static int tmp;
    public static void main (String[] args){
	int[] arr = new int[]{9,1,2,5,10,12,42,98,22,13};
	int[] reverseArr = new int[10];
	// 方法1
	for (int i=arr.length-1;i>=0;i--){
	    reverseArr[reverseArr.length-i-1] = arr[i];
	}
	
	for (int i=0;i<reverseArr.length;i++){
	    System.out.println(reverseArr[i]);
	}
	System.out.println();

	// 方法2
	if (arr.length%2==0){
	    for(int i=0;i<arr.length/2;i++){
		tmp = arr[i];
		arr[i] = arr[arr.length-i-1];
		arr[arr.length-i-1]=tmp;
	    }
	}
	for (int i=0;i<arr.length;i++){
	    System.out.println(arr[i]);
	}

    }
}