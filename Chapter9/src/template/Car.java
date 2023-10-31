package template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public abstract void wipe();
	public void washCar() {}
	
	public void startCar() {
		System.out.println("turn on car");
	}
	
	public void turnOff() {
		System.out.println("turn off car");
	}
	
	public final void run() {//바뀌지 않아야 하는 시나리오에 사용
		startCar();
		drive();
		wipe();
		stop();
		washCar();
		turnOff();
	}
}
