package binary2;

public class BinaryTest2 {

	public static void main(String[] args) {

		int num = 0B00000000000000000000000000000101; //=5
		int num2 = 0B11111111111111111111111111111011; //=-5
		
		int sum = num + num2;

		System.out.println(num);
		System.out.println(num2);
		System.out.println(sum);
	}

}
