package practiceClassPart;

public class Study {
	int sum = 0;
	int sum2 = 0;
	int a = 0;
	
	public void forTest(int num, int num2) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num2; j++) {
				
				sum += j;
			}
			sum2 += i;
		}
		System.out.println(sum+sum2);
	}
	
	public void whileTest(int num) {
		
		sum = 0;
		
		while (true) {
			if(num < 5) {
				a = 5;
				for(int i = 0; i < 6; i++) {
					System.out.println(a + "�� ����մϴ�.");
				}
				break;
			}
			else if(num >= 5) {
				a = 10;
				for (int i = 0; i < 11; i++) {
					System.out.println(a + "�� ����մϴ�.");
				}
				for (int i = 0; i <= num; i++) {
					sum += i;
				}
				System.out.println("0���� " + num + "������ ��� ���� ���� ����� " + sum + "�Դϴ�.");
				break;
			}
		}
	}

}
