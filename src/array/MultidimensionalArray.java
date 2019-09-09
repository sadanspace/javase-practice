public class MultidimensionalArray {
    public static void main(String[] args) {
	// 声明二维数组
	int [][] item;
	// 分配高维数组空间, 数组元素初始值null
	item = new int[4][];
	// 分配低维数组空间，数组元素初始值0
	item[0] = new int[2];
	item[1] = new int[3];
	item[2] = new int[4];
	item[3] = new int[5];
	
	// 打印二维数组元素的值
	for(int i=0;i<item.length;i++){
	    for(int j=0;j<item[i].length;j++){
		System.out.print(item[i][j]+"\t");
	    }
	    System.out.println();
	}
	
	// 声明并分配空间+赋值
	int[][] arr = {{1},{2,3}, {4,5,6}, {7,8}, {9}};
	
	// 打印二维数组元素的值
	for(int i=0;i<arr.length;i++){
	    for(int j=0;j<arr[i].length;j++){
		System.out.print(arr[i][j]+"\t");
	    }
	    System.out.println();
	}
    }
}