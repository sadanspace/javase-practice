/*
  使用数组求平均分
*/
public class AvgScore {
    public static void main(String[] args) {
	int[] scores;
	scores = new int[5];
	scores[0] = 1;
	scores[1] = 2;
	scores[2] = 3;
	scores[3] = 4;
	//int avg;
	int sum = 0;
	for (int i = 0;i < scores.length;i++){
	    sum += scores[i];
	}
	int avg = sum/scores.length;
	System.out.println("avg:"+avg+","+"sum:"+sum);
    }
}