package examplePart;

public class SmartTelevision implements RemoteControl, Searchable{
	public void turnOn() {
		System.out.println("Turn on TV");
	}

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Turn off TV");
		
	}
}
