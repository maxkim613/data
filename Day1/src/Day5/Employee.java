package Day5;

public class Employee {
	String name;
	int salary;
	public Employee() {
	}
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	public void displayInfo() {
		System.out.println("사원: "+this.name + " 월급($) : "+this.salary);
	}
}
