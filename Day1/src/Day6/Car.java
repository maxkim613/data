package Day6;

public class Car {
	
	public void display(Engine engine) {
		System.out.println(
				"Engine type : " +
				engine.getEngine() +
				", year : " +
				engine.getyear() +
				", Power System : " +
				engine.getEtype()
				);
		engine.rotate();
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		Engine gasolineEngine = new Gasoline("Gasloline Engine","2024","Gasoline");
		Engine diselEngine = new Disel("Disel Engine","2021","Disel");
		Engine electricMotor = new Electric("Electric Motor","2025","Electricity");
		
		gasolineEngine.setEtype("Engine");
		diselEngine.setEtype("Engine");
		electricMotor.setEtype("Motor");
		c.display(gasolineEngine);
		c.display(diselEngine);
		c.display(electricMotor);
		

	}

}
