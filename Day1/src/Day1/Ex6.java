package Day1;

public class Ex6 {

	public static void main(String[] args) {
		int x=5;
		boolean result = (x == 5);
		System.out.println("result:"+result);
		String str = "JAVA";
		if(str == "JAVA" ) {
			System.out.println("==비교");
		} 
		if(str.equals("JAVA")) {
			System.out.println("equals 비교");
		}
		
	}

}
