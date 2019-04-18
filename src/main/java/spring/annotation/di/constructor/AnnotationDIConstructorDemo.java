package spring.annotation.di.constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.annotation.di.constructor.bean.Calculator;

public class AnnotationDIConstructorDemo {
	public static void main(String args[]) {
		
		// Get application context
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("AnnotationDIConstructorDemo.xml");
		
		// Get bean
		Calculator calculator = applicationContext.getBean("calculator", Calculator.class);
		
		// Use bean
		System.out.println(calculator.calculate(10, 10));
		
		// Close application context
		applicationContext.close();
	}
}
