package loopexample;

public class ContinueExample2 { // 1. ������ �� ¦�� �ܸ� ����ϱ�   2. �������� �ܺ��� �۰ų� ���� �������� ���ϴ� ��츸 ����϶�

	public static void main(String[] args) {

		int dan = 2;
		int times = 1;
		
		/*while(dan <= 9) {   //���� 1�� ��
			
			if((dan % 2) != 0) {
				dan++;
				continue;
			}
			times = 1;
			while(times <= 9) {
				
				System.out.println(dan + "X" + times + "=" + dan*times);
				times++;
			}
			dan++;
			System.out.println(); 
			
		}*/
		
		while(dan <= 9) { //���� 2�� ��
			times = 1;
			while(times <= 9) {
				if(times > dan) {
					times++;
					continue; //times++�� continue; ��� break;�� ����� �� �ִ�.
				}
				
				System.out.println(dan + "X" + times + "=" + dan*times);
				times++;
			}
			dan++;
			System.out.println();
		}
		
		
		
		
		
	}

}
