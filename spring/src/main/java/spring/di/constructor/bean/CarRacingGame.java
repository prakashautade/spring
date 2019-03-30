package spring.di.constructor.bean;

public class CarRacingGame {
	private Car car;
	
	public CarRacingGame(Car car) {
		super();
		this.car = car;
	}
	
	public void accelerate() {
		car.accelerate();
	}
	
	public void applyBrake() {
		car.applyBrake();
	}
}
