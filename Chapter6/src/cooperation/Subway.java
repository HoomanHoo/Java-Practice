package cooperation;

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) { // 생성자
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) { //메서드
		passengerCount++;
		this.money += money;
	}
	
	public void showInfo() { //메서드
		System.out.println("지하철" + lineNumber + "의 승객은" + passengerCount + "명이고, 수입은" +
							money + "입니다.");
	}


}
