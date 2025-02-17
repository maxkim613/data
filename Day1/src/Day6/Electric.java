package Day6;

public class Electric extends Engine {
private String fuel;
	
	public Electric() {
		System.out.println("Call Electric");
	}
	public Electric(String name,String year, String fuel) {
		super(name,year);
		this.fuel = fuel;
		System.out.println("Call Electric");
	}
	
	public void rotate() {
		System.out.println("Electric Motor run");
	}
}
