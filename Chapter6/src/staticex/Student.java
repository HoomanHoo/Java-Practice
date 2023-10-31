package staticex;

public class Student {
	
	private static int serialNum = 10000; //private 설정으로 타 클래스에서 사용 못함
	int studentId;
	String studentName;
	
	public Student() {
		serialNum++;
		studentId = serialNum; //Student가 생성될 때 마다 serialNum이 증가하고 
	}						   //이 값이 studentId 라는 멤버변수 값에 대입이 된다

	public static int getSerialNum() { //getSerialNum을 통해 serialNum값을 타 클래스에서 읽어드릴 수 있음
		return serialNum;
	}


	
	
}
