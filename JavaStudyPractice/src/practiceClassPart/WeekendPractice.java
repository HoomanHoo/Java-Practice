package practiceClassPart;

public class WeekendPractice {
	
	private int a;
	private int b;
	private String str;
	
	public int total() {
		int sum = 0;
		for (int i = this.a; i <= this.b; i++) {
			sum += i;
		}
		return sum;
	}
	
	
	public void setA(int a) {
		if ((a % 2 != 0) && a > 0 && a < 15) {
			this.a = a;
		}
		else {
			System.out.println("올바른 값이 아닙니다.");
		}
	}
	
	
	public void setB(int b) {
		if (b > 0 && b < 15) {
			this.b = b;
		}
		else {
			System.out.println("올바른 값이 아닙니다.");
		}
	}
	
	public void setStr(String str) {
		if (str.length() < 10 ) {
			this.str = str;
		}
		else {
			System.out.println("올바른 값이 아닙니다");
		}
	}
	
	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}
	
	public String getStr() {
		return str;
	}

}
