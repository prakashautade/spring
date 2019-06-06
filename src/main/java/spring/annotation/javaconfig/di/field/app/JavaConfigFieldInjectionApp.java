package spring.annotation.javaconfig.di.field.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.annotation.javaconfig.di.field.config.JavaConfigDIFieldInjection;
import spring.annotation.javaconfig.di.field.service.CacheService;

public class JavaConfigFieldInjectionApp {

	public static void main(String str[]) {
		// Initialize application context
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfigDIFieldInjection.class);
		
		// Get bean
		CacheService cache = applicationContext.getBean("cacheService", CacheService.class);
		
		// Use bean
		cache.store("serviceStatus", "Running");
		System.out.println("serviceStatus: " + cache.get("serviceStatus"));
		
		// Close application context
		applicationContext.close();
	}
}
