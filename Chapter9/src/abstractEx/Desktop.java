package abstractEx;

public class Desktop extends Computer{

	@Override
	public void display() {
		System.out.println("Desktop display()");
	}

	@Override
	public void typing() {
		System.out.println("Desktop Typing()");
	}

	//@Override
	//public int add(int x, int y) {
		// TODO Auto-generated method stub
	//	return 0;
	//}
	
	public void turnOn() {
		System.out.println("Desktop turn on");
	}

}
