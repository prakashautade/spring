package spring.annotation.scope.bean;

import org.springframework.stereotype.Component;

@Component("dbConnectionPool")
public class DBConnectionPool {
	
	public void releaseAllConnection() {
		System.out.println("Releasing all database connections.");
	}
	
}
