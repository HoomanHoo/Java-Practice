package practiceClassPart;

public class Car {
	String name;
	String color;
	int creatYear;
	
	void carUp() { //void는 리턴값이 없다는 의미이다
		System.out.println("전진합니다");
	}
	
	void carDown() {
		System.out.println("후진합니다.");
	}
	
	int carCreateYear() { //int형 데이터를 반환한다
		return creatYear;
	}
	
	void getCarCreateYear(int year) { //year 값을 파라메터로 받아 creatYear로 넘겨준다
		creatYear = year;
	}

}
