package array;

public class TwoDimenArray {

	public static void main(String[] args) {

		int [][] arr = new int[2][3];
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		System.out.println("=================");
		
		int[][] arr2 = {{1,2,3},{4,5,6}};
		
		for(int i = 0; i<arr2.length; i++) {
				for(int j = 0; j<arr2[i].length; j++) {
					System.out.println(arr2[i][j]);
				}
		}//for���� ���� 2���� �迭�� ����� ��� ��� �� �� ��� ���� �������� �� ������ �����ؾ��Ѵ�
		System.out.println("=================");
		
		char[][] alpa = new char[2][13]; //���ĺ� ���
		char ch = 'A';
		
		for (int i = 0; i < alpa.length; i++) {
			for(int j = 0; j < alpa[i].length; j++, ch++) {
				alpa[i][j] = ch;
				System.out.println(alpa[i][j]);
			}
		}
		
		
		
		
		
		
	}
}
