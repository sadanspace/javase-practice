/* 
九九乘法表四方向打印
*/


public class MultiplicationTable {
    static String placeholder = " "+" "+" "+" "+"  "+'\t';
    public static void main (String[] args){
	// 9x9 左下对齐
	for(int i=1;i<10;i++){
	    for(int j=1;j<=i;j++){
		System.out.print(j+"x"+i+"="+i*j+'\t');
	    }
	    System.out.println();
	}
	// 9x9 左上对齐
	System.out.println();
	for(int i=9;i>0;i--){
	    for(int j=1;j<=i;j++){
		System.out.print(j+"x"+i+"="+i*j+'\t');
	    }
	    System.out.println();
	}
	// 9x9 右上对齐
	System.out.println();
	
	for (int i=9;i>0;i--){
	    int count=9-i;
	    while(count>0){
		System.out.print(placeholder);				
		count--;
	    }
	    
	    for (int j=1;j<=i;j++){
		System.out.print(j+"x"+i+"="+i*j+'\t');
	    }
	    System.out.println();
	}
	// 9x9 右下对齐
	System.out.println();

	for (int i=1;i<10;i++){
	    int count=9-i;
	    while(count>0){
		System.out.print(placeholder);
		count--;
	    }

	    for(int j=1;j<=i;j++){
		System.out.print(j+"x"+i+"="+i*j+"\t");
	    }
	    System.out.println();
	}
    }
}
