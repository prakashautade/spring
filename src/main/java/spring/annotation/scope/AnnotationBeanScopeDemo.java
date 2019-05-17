package spring.annotation.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.annotation.scope.bean.DBConnectionPool;
import spring.annotation.scope.bean.RandomNumber;

public class AnnotationBeanScopeDemo {

	public static void main(String args[]) {
	
		// Create Spring application context
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("AnnotationBeanScopeDemo.xml");
		
		// Get bean 
		DBConnectionPool connectionPool1 = appContext.getBean("dbConnectionPool", DBConnectionPool.class);
		
		// Get bean again
		DBConnectionPool connectionPool2 = appContext.getBean("dbConnectionPool", DBConnectionPool.class);
		
		// Bean scope is singleton, Both beans are referring to same object
		System.out.println("connectionPool1 and connectionPool2 are same: " + (connectionPool1 == connectionPool2) + " (" + connectionPool2 + ", " + connectionPool2 + " )");
		
		
		// Get bean
		RandomNumber randomNumber1 = appContext.getBean("randomNumber", RandomNumber.class);
		
		// Get bean again
		RandomNumber randomNumber2 = appContext.getBean("randomNumber", RandomNumber.class);
		
		// Bean scope is marked as prototype, both references are pointing to separate object
		System.out.println("randomNumber1 and randomNumber1 are different: " + (randomNumber1 != randomNumber2) + " (" + randomNumber1 + ", " + randomNumber2 + " )");
		
		
		// Close Spring application context
		appContext.close();
	}
	
}
