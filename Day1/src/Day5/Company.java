package Day5;

public class Company {

	public static void main(String[] args)  {
		Employee b = new Employee("김태완",5000);
		Manager c = new Manager("최재길",5000,5000);
		b.displayInfo();
		c.displayInfo();
	}
}
