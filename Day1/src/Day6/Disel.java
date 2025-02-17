package Day6;

public class Disel extends Engine {
	private String fuel;
		
	public Disel() {
		System.out.println("Call Disel");
	}
	public Disel(String name,String year, String fuel) {
		super(name,year);
		this.fuel = fuel;
		System.out.println("Call Disel");
	}
	
	public void rotate() {
		System.out.println("Disel Engine run");
	}
}
