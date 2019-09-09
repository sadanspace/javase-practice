/* 
   使用数组打印字母表
*/

public class PrintAlphabet {
    public static void main (String[] args){
	char[] alphabet;
	alphabet = new char[26];
	for (int i=0;i<alphabet.length;i++){
	    alphabet[i] = (char)(i+'A');
	    System.out.println(alphabet[i]);
	}
    }
}