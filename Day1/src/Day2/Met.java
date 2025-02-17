package Day2;

public class Met {
	private String str1;
	private String str2;
	private String str3;
	private int int1;
	//Method overloading
	public void setStr1(String str1) {
		this.str1 = str1;
		System.out.println("str1 : "+str1);
	}
	public void setStr1(int int1) {
		this.int1 = int1;
		System.out.println("int1 : "+int1);
	}
	public void setStr1(String str1, int int1) {
		setStr1(str1);
		setStr1(int1);
	}
	public void setStr1(String str1, int int1, String str2) {
		setStr1(str1,int1);
		this.str2 = str2;
	}
	public String getStr1() {
		return str1;
	}
}