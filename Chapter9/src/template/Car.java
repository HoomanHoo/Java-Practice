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
	
	public final void run() {//�ٲ��� �ʾƾ� �ϴ� �ó������� ���
		startCar();
		drive();
		wipe();
		stop();
		washCar();
		turnOff();
	}
}
