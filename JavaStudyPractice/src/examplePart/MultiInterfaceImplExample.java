package examplePart;

public class MultiInterfaceImplExample {

	public static void main(String[] args) {
		RemoteControl rc = new SmartTelevision(); //RemoteControl �������̽� Ÿ�� ���� ���� �� ������ü SmartTelevision ����
		rc.turnOn(); // RemoteControl �� ����� �޼��常 ȣ�� ����
		rc.turnOff();
		
		Searchable searchable = new SmartTelevision(); //Searchable �������̽� Ÿ�� ���� ���� �� ������ü SmartTelevision ����
		searchable.search("www.google.com"); //SmartTelevision�� ����� �޼��常 ȣ�� ����
	}

}
