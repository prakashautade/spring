package spring.di.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.scope.bean.Logger;
import spring.di.scope.bean.Moment;

public class BeanScopeDemo {

	public static void main(String... args) {
		
		// Create spring context
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("BeanScopeDemo.xml");
		
		// Get logger bean
		Logger logger1 = appContext.getBean("logger", Logger.class);
		
		// Get logger bean again
		Logger logger2 = appContext.getBean("logger", Logger.class);
		
		// Both the bean references are pointing to same object
		System.out.println("Both objects are same: " + (logger1 == logger2) + " ( logger1=" + logger1 + ", logger2= " + logger1 + " ) ");
		
		// Get Moment bean
		Moment moment1 = appContext.getBean("moment", Moment.class);
		
		// Get moment bean again
		Moment moment2 = appContext.getBean("moment", Moment.class);
		
		// Both the bean referring to separate objects
		System.out.println("Both the objects are different: " + (moment1 != moment2) + " ( moment1=" + moment1 + ", moment2=" + moment2 + " )");
		
		// Close spring context
		appContext.close();
	}
	
}
