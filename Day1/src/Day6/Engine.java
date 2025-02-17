package Day6;

public class Engine {
	private String type;
	private String year;
	private String etype;
	
	public Engine() {
		System.out.println("Call Engine");
	}
	
	public Engine(String type,String year) {
		this.type = type;
		this.year = year;
		System.out.println("Call Engine");
	}
	
	public void rotate() {
		System.out.println("Engine run");
	}
	
	public String getEngine() {
		return type;
	}
	public void setEngine(String type) {
		this.type = type;
	}
	public String getyear() {
		return year;
	}
	public void setyear(String year) {
		this.year = year;
	}
	public String getEtype() {
		return etype;
	}
	public void setEtype(String etype) {
		this.etype = etype;
	}
}
