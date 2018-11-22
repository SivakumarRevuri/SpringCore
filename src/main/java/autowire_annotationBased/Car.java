package autowire_annotationBased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	@Autowired
	@Qualifier("engine1")
	private Engine engine;
	// if we use Autowired annotation no need of constructor and setter method.

	public void printData() {
		System.out.println("Engine modle year is: " + engine.getModelNo());
	}
}
