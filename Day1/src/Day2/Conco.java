package Day2;

public class Conco {
	public static void main(java.lang.String[] args) {
		Cons obj1 = new Cons();  // 기본 생성자 호출
        Cons obj2 = new Cons("Hello");  // str1 값 전달
        Cons obj3 = new Cons("Hello", "World");  // str1, str2 값 전달
        Cons obj4 = new Cons("Hello", "World", "Java");  // str1, str2, str3 값 전달
	}
}