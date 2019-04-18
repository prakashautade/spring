package spring.annotation.di.setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.annotation.di.setter.bean.WeatherForecast;

public class WeatherForecastApplication {
	
	public static void main(String args[]) {
	
		// Create bean context
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("WeatherForecastApplication.xml");
		
		// Get bean from container
		WeatherForecast weatherForecast = applicationContext.getBean("weatherForecast", WeatherForecast.class);
		
		// Use bean
		System.out.println(weatherForecast.getCurrentTemperature());
		
		// Close spring context
		applicationContext.close();
	}
}
