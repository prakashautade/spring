package spring.annotation.scope.bean;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RandomNumber {
	
	private int number;
	
	public RandomNumber() {
		number = new Random(10).nextInt();
	}
	
	public int getNumber() {
		return number;
	}
}
