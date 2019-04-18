package spring.annotation.di.constructor.bean;

import org.springframework.stereotype.Component;

@Component
public class SquareAreaCalculator implements ShapeAreaCalculator {
	@Override
	public float area(float base, float height) {
		return base * height;
	}
}
