package Day5;

public class SmartCar extends Car {
	String model;
	public SmartCar() {	
		System.out.println("Child call");
	}
	
	public void print() {
		System.out.println("child run");
	}
	
}
