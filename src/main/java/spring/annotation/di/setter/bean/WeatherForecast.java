package spring.annotation.di.setter.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WeatherForecast {
	
	TemperatureSensor temperatureSensor;
	
	@Autowired
	public void setTemperatureSensor(TemperatureSensor temperatureSensor) {
		this.temperatureSensor = temperatureSensor;
	}

	public TemperatureSensor getTemperatureSensor() {
		return temperatureSensor;
	}
	
	public int getCurrentTemperature() {
		return temperatureSensor.getCurrentTemperature();
	}
	
}
