package classpart;

public class FunctionTest {

	public static void main(String[] args) {

		int num1 = 10;
	    int num2 = 30;  //n1 n2�ʹ� ���� �ٸ� ������ �̸��� ���Ƶ� ��
	    
	    int sum = addNum(num1, num2); //return�� ���� sum�� ���Ե�
	    System.out.println(sum);
	}
	
	public static int addNum(int n1, int n2) { //�Լ� ���� n1 n2�� �Լ� ���ο��� ���� ������ �����̴�.
		int result = n1 + n2;  //��ȯ���� Ÿ�԰� �Լ� ����� Ÿ���� ���ƾ���
		return result;
	} //�Լ� ����

}
