package abstractEx;

public abstract class Computer {//abstract ���� ���� �߻�Ŭ����ȭ ���ش�

	public abstract void display(); //������ ���ϰ� ���� �Ѵٴ� �ǹ� �ż��� �̸� �Ű����� ��ȯ���� �� �� ����
	public abstract void typing();//Ŭ������ �߻�Ŭ������ �ƴ� �� �߻� �޼���� ����� �� ����
	//public void game(){}; {}�� �ٵ��� �ϸ� �ٸ� ���� �����ζ�� �Ѵ�
	
	//public abstract int add(int x, int y);
	
	public void turnOn() {//�߻�Ŭ�������� �Ϲ� �޼��嵵 ���� ���ִ�
		System.out.println("turn on");
	}
	public void turnOff() {
		System.out.println("turn off");
	}
}
