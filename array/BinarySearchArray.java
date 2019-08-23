/*
二分法查找操作：使用二分法查找有序数组中元素。找到返回索引，不存在输出-1。
分析：二分法查找的前提是数组有序。
假如有一组数为3，12，24，36，55，68，75，88要查给定的值24.可设三个变量front，
mid，end分别指向数据的上界，中间和下界，mid=（front+end）/2.　　
 */

public class BinarySearchArray{
    public static void main(String[] args){
	int[] orderedArr = new int[]{3,12,24,36,55,68,75,88};
	int target = 24;
	int frontIndex=0;
	int endIndex=orderedArr.length-1;
	int modIndex=(endIndex-frontIndex)/2 + frontIndex;
	while(true){
	    if (orderedArr[modIndex] == target){
		System.out.println(target + " index is " + modIndex);
		break;
	    } else if(endIndex-frontIndex<=1){
		System.out.println(target+"不存在于此数组");
		break;
	    }
	    
	    if (target > orderedArr[modIndex]){
		frontIndex = modIndex;
		modIndex = (endIndex-frontIndex)/2 + frontIndex;
	    }else {
		endIndex = modIndex;
		modIndex = (modIndex-frontIndex)/2 + frontIndex;
	    }
	}
    }
}