package Day5;

public class Person {
	String name;
	int age;
	
	public  Person() {}
	
	public  Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
	public void displayInfo() {
		System.out.println("이름 : "+ this.name +" 나이 : "+ this.age);
	}
}

