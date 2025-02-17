package Day2;
public class Secondd {
	public int[][] setArr(){
		int[][] num= new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= 9; j++) {
				num[i][j] = 10*i+j+1;
			}
		}
		 return num;
	}
}