package loopexample;

public class nineExample {

	public static void main(String[] args) {

		/*int dan;
		int times;
		
		for(dan = 2; dan <= 9; dan++) {
			
			for(times = 1; times <= 9; times++) {
				System.out.println(dan + "X" + times + "=" + dan*times);
			}
			System.out.println(); //print�� println�� ���̴� ln�� ������ �Ѵٴ� ���� �������̴�. println�� ���鵵 ��½�Ų��. print�� ���� ��½� print("")�� ����Ѵ�
		} */
		
		int dan = 2;
		int times = 1;
		
		while(dan <= 9) {
			
			while(times<=9) {
				System.out.println(dan + "X" + times + "=" + dan*times);
				times++;
			}
			dan++;
			times=1;  //while���� for���� �ٸ��� ��ø �ݺ����� ���� �� �ʱ�ȭ�� �� �����־�� �Ѵ�.
			System.out.println();
		}
	}

}
