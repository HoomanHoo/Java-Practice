package thisEx;

class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year; //this�� �ڱ� �ڽ��� ��Ÿ�� �� year �ڱ� �ڽſ��ٰ� year�� �־�� ��� �ǹ��̴�
	}					  //this�� ������ ������� �� year�� �Ű������� int year�� �����ϰ� �ȴ�
						  // ���װ� ������ �̸��� �ٸ��� �Ű������� �̸��� ������ �̸��� ���� ��쿡�� this�� �� �ᵵ ��

	public void printThis() {
		System.out.println(this); //���� �ڱ� �ڽ�(�ν��Ͻ�)�� �ּҰ��� ���
	}

}

public class ThisExample {

	public static void main(String[] args) {
		
		Birthday b1 = new Birthday();
		Birthday b2 = new Birthday();
		
		System.out.println(b1);
		b1.printThis();
		
		System.out.println(b2);
		b2.printThis();

	}

}
