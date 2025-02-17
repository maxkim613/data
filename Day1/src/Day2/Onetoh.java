package Day2;
public class Onetoh {
	public static void main(java.lang.String[] args) {
		int[][] num= new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= 9; j++) {
				num[i][j] = 10*i+j+1;
				System.out.println("num["+i+"]["+j+"] = "+num[i][j]);
			}
		}
	}
}