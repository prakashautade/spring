package spring.annotation.di.setter.bean;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class TemperatureSensor {
	public int getCurrentTemperature() {
		Random random = new Random();
		return random.nextInt((41 - 20) + 1) + 20;
	}
}
