package examplePart;

import java.util.stream.IntStream;

public class Calc {
	
	public Calc () {
		System.out.println("Calc Ω««‡¡ﬂ...");
	}
	
	public static String emergencyCalc (int a, int b) {
		return "add: " + (a + b) + " sub: " + (a - b) + " mul: " + (a * b) + " div: " + (a / b);
	}
	
	public int add(CalcBase calcBase) {
		int a = calcBase.getA();
		int b = calcBase.getB();
		return a + b;
	}
	
	public int sub(CalcBase calcBase) {
		int a = calcBase.getA();
		int b = calcBase.getB();
		return a - b;
	}
	public int mul(CalcBase calcBase) {
		int a = calcBase.getA();
		int b = calcBase.getB();
		return a * b;
	}
	public int div(CalcBase calcBase) {
		int a = calcBase.getA();
		int b = calcBase.getB();
		return a / b;
	}

}
