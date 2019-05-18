package spring.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.lifecycle.bean.PrinterPool;

public class BeanLifeCycleDemo {

	public static void main(String args[]) {
		// Create application context
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("BeanLifeCycleDemo.xml");
		
		// Get bean
		PrinterPool printerPool = appContext.getBean("printerPool", PrinterPool.class);
		
		// Use bean
		printerPool.getPrinter();
		
		// Close application context
		appContext.close();
	}
	
}
