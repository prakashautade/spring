package spring.annotation.di.field;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.annotation.di.field.bean.CacheService;

public class FieldInjectionDemo {

	public static void main(String args[]) {
	
		// Create application context
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("FieldInjectionDemo.xml");
		
		// Get bean from application container
		CacheService cacheService = applicationContext.getBean("cacheService", CacheService.class);
		
		// Use bean
		cacheService.store("a", "100");
		System.out.println(cacheService.get("a"));
				
		//Close application context
		applicationContext.close();
	}
}
