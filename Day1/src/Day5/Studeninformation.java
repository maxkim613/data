package Day5;

public class Studeninformation {

	public static void main(String[] args) {
		Person a = new Person("김태완",34);
		a.displayInfo();
		Student b = new Student("김태완",23,1);
		b.displayInfo();
		UniversityStudent c = new UniversityStudent("김태완",23,1,"IT");
		c.displayInfo();
	}

}
