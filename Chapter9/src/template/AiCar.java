package template;

public class AiCar extends Car{

	@Override
	public void drive() {
		System.out.println("Autometic drive");
		System.out.println("Car contoll handle itself");
	}

	@Override
	public void stop() {
		System.out.println("break itself");
	}

	@Override
	public void wipe() {
		System.out.println("Wipe window itself");
	}

	@Override
	public void washCar() {
		System.out.println("wash itself");
		super.washCar();
	}
	
	

}
