package Day1;

import java.util.Scanner;

public class Weight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("현재 몸무게: ");
		int p = sc.nextInt();
		System.out.print("목표 몸무게: ");
		int g = sc.nextInt();
		for(int i = p;i>=g;i--) {
			System.out.println("몸무게가 1kg줄었습니다. 현재 몸무게 : "+i);
			if(i==g) {
				System.out.println("목표달성");
			}
		}
	}

}
