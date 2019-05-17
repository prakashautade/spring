package spring.di.scope.bean;

public class ConsoleLogger implements Logger {

	@Override
	public void info(String message) {
		System.out.println("[INFO] " + message);
	}

}
