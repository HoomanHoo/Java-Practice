package abstractEx;

public abstract class Computer {//abstract 예약어를 통해 추상클래스화 해준다

	public abstract void display(); //구현을 안하고 선언만 한다는 의미 매서드 이름 매개변수 반환값만 알 수 있음
	public abstract void typing();//클래스가 추상클래스가 아닐 시 추상 메서드는 사용할 수 없다
	//public void game(){}; {}은 바디라고 하며 다른 말로 구현부라고 한다
	
	//public abstract int add(int x, int y);
	
	public void turnOn() {//추상클래스에는 일반 메서드도 넣을 수있다
		System.out.println("turn on");
	}
	public void turnOff() {
		System.out.println("turn off");
	}
}
