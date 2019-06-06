package spring.annotation.javaconfig.di.propertiesfile.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.annotation.javaconfig.di.propertiesfile.bean.DeviceInfo;
import spring.annotation.javaconfig.di.propertiesfile.config.JavaConfigDIPropertiesFile;

public class JavaConfigDIPropertiesFileApp {

	public static void main(String args[]) {
		// Create application context
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfigDIPropertiesFile.class);
		
		// Get bean from spring container
		DeviceInfo deviceInfo = applicationContext.getBean("deviceInfo", DeviceInfo.class);
		
		// Use bean
		System.out.println("DeviveInfo: " + deviceInfo.getVersion());
		
		// Close application context
		applicationContext.close();
		
	}
}
