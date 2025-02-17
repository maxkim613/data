package Day5;

public class Student extends Person {
		int grade;
		
		public Student() {}
		
		public Student(String name, int age,int grade) {
			this.age = age;
			this.name = name;
			this.grade = grade;
		}
		public void displayInfo() {
			System.out.println("이름 : "+ this.name +" 나이 : "+ this.age+" 성적 : "+ this.grade);
		}


}
