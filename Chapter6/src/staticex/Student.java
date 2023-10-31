package staticex;

public class Student {
	
	private static int serialNum = 10000; //private �������� Ÿ Ŭ�������� ��� ����
	int studentId;
	String studentName;
	
	public Student() {
		serialNum++;
		studentId = serialNum; //Student�� ������ �� ���� serialNum�� �����ϰ� 
	}						   //�� ���� studentId ��� ������� ���� ������ �ȴ�

	public static int getSerialNum() { //getSerialNum�� ���� serialNum���� Ÿ Ŭ�������� �о�帱 �� ����
		return serialNum;
	}


	
	
}
