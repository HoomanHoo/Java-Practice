package interfaceExample;

public class RoundRobin implements Scheduler{
	
	public void getNextCall() {
		System.out.println("�����ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}

	public void sendCallToAgent() {
		System.out.println("���� ���� �������� �����մϴ�.");
	}
}
