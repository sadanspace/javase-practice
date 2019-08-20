/*
平均时间复杂度O(n^2)
最好时间复杂度O(n)，恰好是有序的，且和排序方向相同
最坏时间复杂度O(n^2)，恰好是逆序，要完整的遍历两个循环
*/

public class BubbleSort {
    static int tmp;

    public static void main(String[] args) {
	int [] arr1 = new int[]{10, 9, 8 ,7 ,6};
	for(int i=0;i<arr1.length;i++){  // n
	    boolean flag = false;
	    for (int j=0;j<arr1.length-i-1;j++){   // n
		if (arr1[j]>arr1[j+1]){
		    tmp = arr1[j];
		    arr1[j] = arr1[j+1];
		    arr1[j+1] = tmp;
		    flag = true;
		}
	    }
	    if(!flag) {
		break;
	    }
	}
	
	for(int i=0;i<arr1.length;i++){
	    System.out.print(arr1[i]+"\t");
	}
    }
}