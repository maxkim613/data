package Day4; 
public class Dragon {
	
	//Method overloading
	private String str1;
	private String str2;
	private String str3;
	int int1;
	
	public void setStr1() {
		System.out.println("Basic");
	}
	public void setStr1(int int1) {
		setStr1();
		this.int1 = int1;
		System.out.println("int1 :"+int1);
	}
	public void setStr1(String str1) {
		this.str1 = str1;
		System.out.println("str1  :"+str1);
	}
	public void setStr1(String str1,String str2) {
		setStr1(str1);
		this.str2 = str2;
		System.out.println("str2  :"+str2);
	}
	public void setStr1(String str1,String str2,String str3) {
		setStr1(str1,str2);
		this.str3 = str3;
		System.out.println("str3  :"+str3);
	}
}