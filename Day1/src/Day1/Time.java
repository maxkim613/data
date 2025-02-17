package Day1;

public class Time { 
	public static void main(String[] args) {
		for(int i=2;i<=9;i++) {
			System.out.println(i+"단");
			for(int j=1;j<=9;j++) {
				int mul= i*j;
				System.out.print(i+"*"+j+"="+mul+" ");
			}
			System.out.println("");
			}
		}
	}
