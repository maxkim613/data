package Day2;

public class Secondd20c {
	public static void main(java.lang.String[] args) {
        Secondd20 sec = new Secondd20();  // str1 값 전달
        int[][] num = sec.setArr();
        for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.println("num["+i+"]["+j+"] = "+num[i][j]);
			}
		}
	}
}