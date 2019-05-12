package spring.annotation.di.qualifier;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.annotation.di.qualifier.bean.Clock;

public class DIQualifierDemo {

	public static void main(String args[]) {
		
		// Create Spring Context
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("DIQualifierDemo.xml");
		
		// Get bean
		Clock clock = applicationContext.getBean("clock", Clock.class);
		
		// Use bean
		clock.displayTime();
		
		// Close spring context
		applicationContext.close();
	}
}
