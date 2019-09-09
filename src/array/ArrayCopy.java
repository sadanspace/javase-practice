import java.lang.String;

public class ArrayCopy{
    public static void main(String[] args){
	String[] fruits = {"banana", "apple", "peach", "pear", "watermalon"};
	String[] myFavoriteFruits = new String[2];
	// 深拷贝
	System.arraycopy(fruits, 0, myFavoriteFruits, 0, myFavoriteFruits.length);

	// 打印数组元素
	for(int i=0;i<myFavoriteFruits.length;i++){
	    System.out.println(myFavoriteFruits[i]);
	}
	System.out.println();

	myFavoriteFruits[0] = "grape";
	System.out.println("myFavoriteFruits[0]: "+myFavoriteFruits[0]);
	System.out.println("fruits[0]: "+fruits[0]);	


	// 浅拷贝
	String[] fruitsBak = fruits;
	fruitsBak[0] = "strawberry";
	System.out.println("fruitsBak[0]: "+fruitsBak[0]);
	System.out.println("fruits[0]: "+fruits[0]);
	
    }
}