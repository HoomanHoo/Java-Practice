package examplePart;

public class SmartTelevision implements RemoteControl, Searchable{
	public void turnOn() {
		System.out.println("Turn on TV");
	}

	@Override
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("Turn off TV");
		
	}
}
