
public class ExplicitConversion {

	public static void main(String[] args) {
		
		int iNum = 1000;
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);
		System.out.println(bNum); 
		
		double dNum = 3.14;
		iNum = (int)dNum;
		System.out.println(iNum); 
		
		float fNum = 0.9F;
		int num1 = (int)dNum + (int)fNum; //실수들을 정수로 변환 후 더함
		int num2 = (int)(dNum + fNum);  //실수들을 더한 후 정수로 변환
		
		System.out.println(num1);
		System.out.println(num2);
	}

}
