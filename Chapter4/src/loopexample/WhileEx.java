package loopexample;

public class WhileEx {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
		/*while(num <= 10) { //while ���� ��� ������ �ʿ䰡 �ִ� ��� (���α׷��� ������� ���ƾ� �ϴ°��) ���ǽĿ� true�� ����ִ´� �����ؾ� �ϴ� ��� break���� ����Ѵ�.
			
			sum += num;
			num++;
		} */
		
		do { //do-while���� ���๮�� �տ� �ֱ� ������ ���� ���๮�� ����ǰ� ���ǽ��� üũ�� �� �ٽ� ���๮�� �������� �����Ѵ�.
			sum += num;
			num++;
		} while(num <= 10);
		
		System.out.println("1���� 10������ ���� " + sum +" �Դϴ�.");
	}

}
