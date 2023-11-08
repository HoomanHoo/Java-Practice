package interfaceExample;

public class CalcuratorTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;

		Calc calc = new CompleCalc();
		int result = calc.add(3, 5);
		System.out.println(result);

		Calc calc2 = new CompleCalc();
		int result2 = calc2.add(num1, num2);
		System.out.println(result2);

		CompleCalc calc3 = new CompleCalc();
		calc3.divide(7, 3);

		calc.description();

		int[] arr = { 1, 2, 3, 4, 5 };
		int sum = Calc.total(arr);
		System.out.println(sum);
	}

}
