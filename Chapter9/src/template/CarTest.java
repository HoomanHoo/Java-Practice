package template;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new ManualCar();
		myCar.run();
		
		System.out.println("============");
		
		Car myCar2 = new AiCar();
		myCar2.run();
	}

}
