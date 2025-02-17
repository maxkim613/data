package Day5;

public class Car {
	public String model;
	public Car() {	
		System.out.println("Parent call");
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void print() {
		System.out.println("parent run");
	}
}
