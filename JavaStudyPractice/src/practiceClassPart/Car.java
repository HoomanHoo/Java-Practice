package practiceClassPart;

public class Car {
	String name;
	String color;
	int creatYear;
	
	void carUp() { //void�� ���ϰ��� ���ٴ� �ǹ��̴�
		System.out.println("�����մϴ�");
	}
	
	void carDown() {
		System.out.println("�����մϴ�.");
	}
	
	int carCreateYear() { //int�� �����͸� ��ȯ�Ѵ�
		return creatYear;
	}
	
	void getCarCreateYear(int year) { //year ���� �Ķ���ͷ� �޾� creatYear�� �Ѱ��ش�
		creatYear = year;
	}

}
