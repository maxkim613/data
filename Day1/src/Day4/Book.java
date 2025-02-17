package Day4; 
public class Book {
	
	//Method overloading
	String str1;
	String str2;
	String str3;
	int int1;
	
	public Book() {
		System.out.println("Basic");
	}
	public Book(int int1) {
		this();
		this.int1 = int1;
		System.out.println("int1 :"+int1);
	}
	public Book(String str1) {
		this.str1 = str1;
		System.out.println("str1  :"+str1);
	}
	public Book(String str1,String str2) {
		this(str1);
		this.str2 = str2;
		System.out.println("str2  :"+str2);
	}
	public Book(String str1,String str2,String str3) {
		this(str1,str2);
		this.str3 = str3;
		System.out.println("str3  :"+str3);
	}
}