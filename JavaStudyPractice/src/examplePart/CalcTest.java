package examplePart;

import java.util.Random;

public class CalcTest {
	
	public static void main(String[] args) {
		System.out.println(Calc.emergencyCalc(4,6));
		
		CalcBase cb = new CalcBase();
		Calc ca = new Calc();
		
		cb.setA(4);
		cb.setB(6);
		
		System.out.println(ca.add(cb));
		System.out.println(ca.sub(cb));
		System.out.println(ca.mul(cb));
		System.out.println(ca.div(cb));
		
		System.out.println();
		
		new Random().ints(2,1,11).forEach(System.out::println);
	} //ints �޼��带 �̿��� 1~10������ ���� �� 2���� ������ ����

}
