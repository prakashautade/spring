package spring.lifecycle.bean;

public class PrinterPool {

	public PrinterPool() {
		System.out.println("Inside PrinterPool constructor.");
	}
	
	public void init() {
		System.out.println("Inside PrinterPool init method.");
	}
	
	public void destroy() {
		System.out.println("Inside PrinterPool destroy method.");
	}
	
	public void getPrinter() {
		System.out.println("Returning printer from pool");
	}
}
