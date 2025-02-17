package Day5;

public class Manager extends Employee {
	int bonus;
	public Manager() {
	}
	public Manager(String name, int salary,int bonus) {
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
	}
	public void displayInfo() {
		System.out.println("PM: "+this.name + " 월급($) : "+this.salary+ " 보너스($) : "+this.bonus);
	}
}
