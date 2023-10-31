package practiceClassPart;

public class WkdPractice {
	
	int a2;
	int b2;
	String str2;
	
	public WkdPractice(int a2, int b2, String str2) {
		this.a2 = a2;
		this.b2 = b2;
		this.str2 = str2;
		System.out.println("변수 a2, b2, str2를" + a2 +", " + b2 + ", " + str2 + "로 초기화 했다");
	}
	
	public int callTotal(WeekendPractice weekendPractice) {
		int k = weekendPractice.total();
		return k + a2;
	}
	
	public String strAdd(WeekendPractice weekendPractice) {
		return str2 + " " + weekendPractice.getStr();
	}

}
