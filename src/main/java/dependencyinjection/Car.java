package dependencyinjection;

public class Car {

	private Engine engine;
	private String name;
	
	public Car() {
		System.out.println("I am Car constructor...");
	}
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
