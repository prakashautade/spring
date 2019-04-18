package spring.annotation.di.constructor.bean;

import org.springframework.stereotype.Component;

@Component
public interface ShapeAreaCalculator {
	float area(float base, float height);
}
