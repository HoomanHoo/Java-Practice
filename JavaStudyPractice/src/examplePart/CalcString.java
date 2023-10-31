package examplePart;

public class CalcString {
	private String str1;
	private String str2;
	private String str3;
	private String str4;
	String str5 = "This is String";
	
	public void setStr1(String str1) {
		if (str1.length() < 11) {
			this.str1 = str1;
		}
		else {
			System.out.println("잘못된 입력입니다");
		}
	}
	public void setStr2(String str2) {
		if (str2.length() < 11) {
			this.str2 = str2;
		}
		else {
			System.out.println("잘못된 입력입니다");
		}
	}
	public void setStr3(String str3) {
		if (str3.length() < 11) {
			this.str3 = str3;
		}
		else {
			System.out.println("잘못된 입력입니다");
		}
	}
	public void setStr4(String str4) {
		if (str4.length() < 11) {
			this.str4 = str4;
		}
		else {
			System.out.println("잘못된 입력입니다");
		}
	}
	public String getStr1() {
		return str1;
	}
	public String getStr2() {
		return str2;
	}
	public String getStr3() {
		return str3;
	}
	public String getStr4() {
		return str4;
	}
	
	

}
