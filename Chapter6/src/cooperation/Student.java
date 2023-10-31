package cooperation;

public class Student {
	
	String name;
	int grade;
	int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) { //������ �ν��Ͻ��� �Ű������� ����
		bus.take(1000);
		money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(name + "���� ���� ����" + money + "�Դϴ�.");
	}

}
