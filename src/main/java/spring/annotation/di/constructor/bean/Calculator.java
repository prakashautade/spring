package spring.annotation.di.constructor.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
	private ShapeAreaCalculator shapeAreaCalculator;
	
	@Autowired
	public Calculator(ShapeAreaCalculator shapeAreaCalculator) {
		this.shapeAreaCalculator = shapeAreaCalculator;
	}
	
	public float calculate(float base, float height) {
		return shapeAreaCalculator.area(base, height);
	}
}
