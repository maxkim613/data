package Day6;

public class Gasoline extends Engine {
	private String fuel;
	
	public Gasoline() {
		System.out.println("Call Gasoline");
	}
	public Gasoline(String name,String year, String fuel) {
		super(name,year);
		this.fuel = fuel;
		System.out.println("Call Gasoline");
	}
	
	public void rotate() {
		System.out.println("Gasoline Engine run");
	}
}
