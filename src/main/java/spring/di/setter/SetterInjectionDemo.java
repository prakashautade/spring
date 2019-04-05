package spring.di.setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionDemo {
	public static void main(String args[]) {
		// Create application context
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("SetterDIAppContext.xml");
		
		//Get bean
		Mobile mobile = applicationContext.getBean("mobile", Mobile.class);

		//Use bean
		mobile.playSong("Zindagi Na Milegi Dobara:: Toh Zinda Ho Tum");
		System.out.println(mobile.getDeviceInfo());
		
		//Close application context
		applicationContext.close();
	}
}
