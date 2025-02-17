package Day3;

public class Star {

	public Star(int sline) {
		/**
		 * @param sline은 크기
		 */
		//윗 삼각형
		//공백의 시작은 sline보다 1 작아야함 마지막 값은 0 한 번 돌릴 때 마다 1씩 작아져야함
		for (int i = 0; i < sline; i++) {
			for (int j = 0; j < 3*sline-i-2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		//중간윗 역삼각형
		//공백의 시작은 0으로 시작 1씩 증가 
		for (int i = 0; i < sline; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 6*sline-2*i-3; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		//중간 밑 삼각형
		//시작은 공백은 길이만큼 갯수는 -1
		for (int i = 0; i < sline+1; i++) {
			for (int j = 0; j < sline-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i+4*sline-2; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		//아래 역삼각형
		//공백의 시작은 2sline-1으로 시작 1씩 증가 
		//별은 처음은 2sline-1로 시작하고 2씩 감소
		for (int i = 0; i < sline; i++) {
			for (int j = 0; j < 2*sline-1+i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*sline-2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
