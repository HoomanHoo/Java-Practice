package reference;

public class Student {
	
	int studentId;
	String studentName; //String ���� JDK���� �⺻ �����ϴ� �ڷ��� �߿����� NEW ����� ���� �� �� �ִ� ���� �ִ�.
	Subject korea; //�����ڷ���
	Subject math;
	
	public Student() {
		korea = new Subject("����"); //�ش� �����ڷ����� ���� �ν��Ͻ� ����
		math = new Subject("����");
		
	}
	
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
		
		korea = new Subject("����"); //�ش� �����ڷ����� ���� �ν��Ͻ� ����
		math = new Subject("����");
		
	}

	public void setKorea(int score) {
		//�������.�����ڷ���()�� �����̴�
		korea.setScore(score);
		
		//korea.subjectName = name; //privite �� �ƴϱ� ������ ù��° �ڵ�� ���� ������ �Ѵ�
	}
	
	public void setMath(int score) { //�������.�����ڷ���()�� �����̴�
		math.setScore(score);
		
	}
	
	public void showStudentInfo() {
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName + " �л��� ������ " + total + "�� �Դϴ�.");
	}
	
}
