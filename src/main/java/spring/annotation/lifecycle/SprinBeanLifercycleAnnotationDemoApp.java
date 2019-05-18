package spring.annotation.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.annotation.lifecycle.bean.PrinterPool;

public class SprinBeanLifercycleAnnotationDemoApp {

	public static void main(String[] args) {

		// Create Spring application context
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("SprinBeanLifercycleAnnotationDemoApp.xml");
		
		// Get bean
		PrinterPool printerPool = appContext.getBean("printerPool", PrinterPool.class);
		
		// Use bean
		printerPool.getPrinter();
		
		//Destroy bean
		appContext.close();
	}

}
