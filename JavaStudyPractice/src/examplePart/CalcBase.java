package examplePart;

public class CalcBase {
	private int a;
	private int b;
	
	public void setA(int a) {
		if (a > 0 && a < 11) {
			this.a = a;
		}
		else {
			System.out.println("��ȿ�� ���� �ƴմϴ�");
		}
	}
	public void setB(int b) {
		if (b > 0 && b < 11) {
			this.b = b;
		}
		else {
			System.out.println("��ȿ�� ���� �ƴմϴ�");
		}
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}

}
