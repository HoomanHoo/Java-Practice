package loopexample;

public class BreakExample {

	public static void main(String[] args) {

		int sum = 0;
		int num = 1;
		
		/*while(sum < 100) {
			sum += num;
			num++;
		} */ //sum�� 100�� ���� ����� ���� �Ǵ��� num ���� �����ϱ� ������ sum ���� 100�� �ѱ�� ������ ��Ȯ�� num���� ���� �� ����
		
		while(true) {
			sum += num;
			if(sum > 100) { //sum���� 100�� �ѱ�� break���� �۵��ϰ� �Ǿ� ������ �ݺ����� �������� �ʰ� �ݺ����� �������´�. 
				break;
			}
			
			num++; //sum���� 100�� �Ѵ� ���� break���� �۵��Ͽ� num++ �� ������� �ʱ� ������ sum�� 100�� �ѱ�� ������ num���� ���� �� �ִ�.
		}
		
		System.out.println(sum);
		System.out.println(num);
	}

}
