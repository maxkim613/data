package Day5;

public class Main {

	public static void main(String[] args) {
		Temp te = new Temp();
		Car c = new SmartCar();
		c.setModel("Hyundai");
		te.Print(c);
	}
}
