package array;

public class ArrayTest {

	public static void main(String[] args) {

		int[] number = new int[10];
		
		int[] num2 = new int[] {0,1,2,3}; //����� ���ÿ� �ʱ�ȭ
		
		int[] num3 = {0,1,2}; //���� ���� ����� �ƴ�
		
		int[] num4;
		
		double[] num5 = new double[3];
		
		num4 = new int[3];
		
		num4[0] = 6; //num4�� 0��° �ڸ��� 6�̶�� ���� �ִ´�
		num4[1] = 7;
		num4[2] = 8;
		
		
		System.out.println(number.length);
		System.out.println(num2.length);
		
		for(int i = 0; i<3; i++) //�迭�� ��� <= ���ٴ� <�� ���°� �迭�� ���̸� �� �� �־ �������� �� ����
		{
			System.out.println(num4[i]);
			}
		
		System.out.println(num5[0]);
		
		int[] arr = new int [] {1,2,3,4,5}; //�⺻�� ��ü�� ����
		int[] arr2 = new int[10];
		
		arr2[0] = 8;
		arr2[1] = 7;
		
		System.arraycopy(arr, 0, arr2, 2, 5);
		
		for(int i = 0; i <arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

}
