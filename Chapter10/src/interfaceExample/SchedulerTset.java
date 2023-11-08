package interfaceExample;

import java.io.IOException;


public class SchedulerTset {

	public static void main(String[] args) throws IOException {
		//R�� ������ ���� �κ�
		//L�� ������ ����Ʈ������
		//P�� ������ ��������Ƽ������̼�����
		
		
		System.out.println("��ȭ��� ���� ����� �����ϼ��� R, L, P");
		
		int ch = System.in.read();//�Է��� �޴� ����̴� ���ڿ��� ġ�� ���͸� ������ �Է��� �Ϸ�ȴ�
		
		Scheduler scheduler = null;
		
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}
		else if(ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		}
		else if(ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
