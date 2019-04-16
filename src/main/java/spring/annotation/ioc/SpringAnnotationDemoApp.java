package spring.annotation.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.annotation.ioc.bean.AppProperties;

public class SpringAnnotationDemoApp {

		public static void main(String args[]) {
			
			// Load application context
			ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringAnnotationDemoApp.xml");
			
			// Request bean
			AppProperties appProperties = applicationContext.getBean("applicationProperties", AppProperties.class);
			
			// Use bean
			System.out.println(appProperties);
			
			// Close application context
			applicationContext.close();
		}
}
