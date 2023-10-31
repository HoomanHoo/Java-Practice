package assignment;

public class OperationEx4 {

	public static void main(String[] args) {

		int num1 = 10;
		System.out.println(num1 += 1);
		
		System.out.println(num1 %= 10);
		num1 -= 1; // = num1 = num1 - 1;
		System.out.println(num1);
		
		
		int num = (5>3)? 9:20; //결과 부분에는 숫자 대신 문장이 올 수도 있다.
		System.out.println(num);
		
		int ex = (8<5)? num1:--num;
		System.out.println(ex);
		
		
	}

}
