package array;

public class ArrayTest {

	public static void main(String[] args) {

		int[] number = new int[10];
		
		int[] num2 = new int[] {0,1,2,3}; //선언과 동시에 초기화
		
		int[] num3 = {0,1,2}; //자주 쓰는 방법은 아님
		
		int[] num4;
		
		double[] num5 = new double[3];
		
		num4 = new int[3];
		
		num4[0] = 6; //num4의 0번째 자리에 6이라는 값을 넣는다
		num4[1] = 7;
		num4[2] = 8;
		
		
		System.out.println(number.length);
		System.out.println(num2.length);
		
		for(int i = 0; i<3; i++) //배열의 경우 <= 보다는 <를 쓰는게 배열의 길이를 알 수 있어서 가독성이 더 좋다
		{
			System.out.println(num4[i]);
			}
		
		System.out.println(num5[0]);
		
		int[] arr = new int [] {1,2,3,4,5}; //기본형 객체의 복사
		int[] arr2 = new int[10];
		
		arr2[0] = 8;
		arr2[1] = 7;
		
		System.arraycopy(arr, 0, arr2, 2, 5);
		
		for(int i = 0; i <arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

}
