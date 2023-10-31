package template;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("Person is drive it");
		System.out.println("Person controll handle");
	}

	@Override
	public void stop() {
		System.out.println("Person push break pedal");
	}

	@Override
	public void wipe() {
		System.out.println("push wipe button");
	}
	
	//public void run() {
	//	System.out.println("ss"); 
	//} final 선언되어있기 때문에 오버라이드 될 수 없다
	
	

}
