package spring.annotation.lifecycle.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class PrinterPool {
	
	public PrinterPool() {
		System.out.println("Inside PrinterPool constructor.");
	}

	@PostConstruct
	public void init() {
		System.out.println("Inside PrinterPool init method.");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Inside PrinterPool destroy method.");
	}
	
	public void getPrinter() {
		System.out.println("Returning printer from pool");
	}
}
