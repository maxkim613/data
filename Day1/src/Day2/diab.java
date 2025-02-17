package Day2;

public class diab {

	public static void main(java.lang.String[] args) {
		String str1 = "김태완";
		String str2 = "김태완";
		String str3 = new String("김태완");
		System.out.println((str1 == str2));
		System.out.println((str1 == str3));
		System.out.println((str1.equals(str3)));

	}

}
