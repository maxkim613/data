package Day2;

public class Seconddc {
	public static void main(java.lang.String[] args) {
        Secondd sec = new Secondd();  // str1 값 전달
        int[][] num = sec.setArr();
        for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println("num["+i+"]["+j+"] = "+num[i][j]);
			}
		}
	}
}