package practiceClassPart;

public class TypeDownChange {

	public static void main(String[] args) {
		int intValue = 10;
		byte byteValue = (byte) intValue;
		System.out.println(byteValue);
		
		int intValue2 = 103029770;
		byte byteValue2 = (byte) intValue2;
		System.out.println(byteValue2); //4����Ʈ�� int�� ������ �������� byte�� ������ 1byte�� ������ 2�������� ���Ƽ� ���� ǥ���Ѵ�
		
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