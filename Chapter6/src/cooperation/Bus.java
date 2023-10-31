package cooperation;

public class Bus {
	
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) { // 생성자
		this.busNumber = busNumber;
	}
	
	public void take(int money) { //메서드
		passengerCount++;
		this.money += money;
	}
	
	public void showInfo() { //메서드
		System.out.println("버스" + busNumber + "번의 승객은" + passengerCount + "명이고, 수입은" +
							money + "입니다.");
	}

}
