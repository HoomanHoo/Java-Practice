package examplePart;

public class MultiInterfaceImplExample {

	public static void main(String[] args) {
		RemoteControl rc = new SmartTelevision(); //RemoteControl 인터페이스 타입 변수 선언 및 구현객체 SmartTelevision 대입
		rc.turnOn(); // RemoteControl 에 선언된 메서드만 호출 가능
		rc.turnOff();
		
		Searchable searchable = new SmartTelevision(); //Searchable 인터페이스 타입 변수 선언 및 구현객체 SmartTelevision 대입
		searchable.search("www.google.com"); //SmartTelevision에 선언된 메서드만 호출 가능
	}

}
