package classpart;

public class StudentTest {

public static void main(String[] args) {
		
		int i = 10; //�⺻ ������ Ÿ��, ��ü�� �ƴϴ�
		
		Student studentLee = new Student(100, "�̼���"); //���޸𸮿� ���� / ��ü�̴� / ������ ������ Ÿ�� studentLee �� ���������̴�
	/*	studentLee.studentName = "�̼���";
		studentLee.studentID = 100; */
		studentLee.address = "����� �������� ��������";
		
	/*	Student studentKim = new Student(101); //����Ʈ �������϶� ��� ����
		studentKim.studentName = "������";
		studentKim.studentID = 1340;
		studentKim.address = "�̱� ��ȣ��"; //Lee Kim �� �� �ν��Ͻ��̴� ���������̱⵵ �ϴ�
	*/	
		studentLee.showStudentInfo();
		//studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		//System.out.println(studentKim);
	}

}
