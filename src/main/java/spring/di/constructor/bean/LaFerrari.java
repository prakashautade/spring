package spring.di.constructor.bean;

public class LaFerrari implements Car {
	
	@Override
	public void accelerate() {
		// https://en.wikipedia.org/wiki/LaFerrari
		System.out.println("Accelerating, Top speed is 349 km/h");
	}
	
	@Override
	public void applyBrake() {
		// https://en.wikipedia.org/wiki/LaFerrari
		System.out.println("Applyin brakes, Using ABS/EBD");
	}
	
}
