package staticex;

public class StudentTest {

	public static void main(String[] args) {
		System.out.println(Student.getSerialNum()); //�ν��Ͻ��� ��� ���� ���α׷� ����� ������
		
		Student studentJames = new Student();
		System.out.println(studentJames.studentId);
		
		
		Student studentTomas = new Student();
		System.out.println(studentTomas.studentId);
		
		System.out.println(studentJames.studentId);
		System.out.println(studentTomas.studentId);
		
		System.out.println(studentJames.getSerialNum());
		System.out.println(studentTomas.getSerialNum());
		System.out.println(Student.getSerialNum());
		
		
		
	}

}
