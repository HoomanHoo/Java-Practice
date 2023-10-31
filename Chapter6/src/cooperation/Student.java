package cooperation;

public class Student {
	
	String name;
	int grade;
	int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) { //생성된 인스턴스를 매개변수로 받음
		bus.take(1000);
		money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(name + "님의 남은 돈은" + money + "입니다.");
	}

}
