package practiceClassPart;

public class TypeDownChange {

	public static void main(String[] args) {
		int intValue = 10;
		byte byteValue = (byte) intValue;
		System.out.println(byteValue);
		
		int intValue2 = 103029770;
		byte byteValue2 = (byte) intValue2;
		System.out.println(byteValue2); //4바이트인 int의 이진수 범위에서 byte의 범위인 1byte의 범위의 2진수만이 남아서 값을 표현한다
		
		System.out.println("=====================");
		
		int var1= 10;
		byte var2 = (byte) var1;
		System.out.println(var2);
		
		long var3 = 300;
		int var4 = (int) var3;
		System.out.println(var4);
		
		int var5 = 65;
		char var6 = (char) var5;
		System.out.println(var6);
		
		double var7 = 3.14;
		int var8 = (int) var7;
		System.out.println(var8);
	}

}
