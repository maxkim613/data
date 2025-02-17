package Day5;

public class UniversityStudent extends Student {
	String major;

	public  UniversityStudent(String name, int age,int grade,String major) {
		this.age = age;
		this.name = name;
		this.grade = grade;
		this.major = major;
	}
	public void displayInfo() {
		System.out.println("이름 : "+ this.name +" 나이 : "+ this.age+" 성적 : "+ this.grade + " 전공 : "+ this.major );
	}
}
