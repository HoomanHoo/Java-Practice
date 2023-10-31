package staticex;

public class StudentTest {

	public static void main(String[] args) {
		System.out.println(Student.getSerialNum()); //인스턴스와 상관 없이 프로그램 실행시 생성됨
		
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
