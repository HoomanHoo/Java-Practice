package examplePart;

public class CalcBase {
	private int a;
	private int b;
	
	public void setA(int a) {
		if (a > 0 && a < 11) {
			this.a = a;
		}
		else {
			System.out.println("유효한 값이 아닙니다");
		}
	}
	public void setB(int b) {
		if (b > 0 && b < 11) {
			this.b = b;
		}
		else {
			System.out.println("유효한 값이 아닙니다");
		}
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}

}
