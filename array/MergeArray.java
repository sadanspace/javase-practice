/*

合并数组操作：现有如下一个数组：int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5}
要求将以上数组中值为0的项去掉，将不为0的值存入一个新的数组，
生成的新数组为： int newArr [] ={1,3,4,5,6,6,5,4,7,6,7,5}

*/

public class MergeArray {
    public static void main(String[] args){
	int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
	int zeroCount = 0;
	for(int i=0;i<oldArr.length;i++){
	    if (oldArr[i] == 0){
		zeroCount += 1;
	    }
	}
	int newArr[] = new int[oldArr.length-zeroCount];
	int newArrIndex = 0;
	for(int i=0;i<oldArr.length;i++){
	    if (oldArr[i]!=0){
		newArr[newArrIndex] = oldArr[i];
		System.out.println(newArr[newArrIndex]);
		newArrIndex+=1;

	    }
	}

	
    }
}