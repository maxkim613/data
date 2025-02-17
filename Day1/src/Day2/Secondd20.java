package Day2;
public class Secondd20 {
	public int[][] setArr(){
		int[][] num= new int[10][20];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= 19; j++) {
				num[i][j] = 20*i+j;
			}
		}
		 return num;
	}
}