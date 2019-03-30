package spring.di.constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.constructor.bean.CarRacingGame;

public class ConstructorDIDemoApp {
	
	public static void main(String[] args) {
		
		// Create spring application context
		ClassPathXmlApplicationContext applicationContext
			= new ClassPathXmlApplicationContext("ConstructorDIAppContext.xml");
		
		// Retrieve bean
		CarRacingGame game = applicationContext.getBean("carRacingGame", CarRacingGame.class);
		
		// Use bean
		game.accelerate();
		game.applyBrake();
		
		// Close spring application context
		applicationContext.close();
	
	}

}
