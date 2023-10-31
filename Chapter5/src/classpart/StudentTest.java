package classpart;

public class StudentTest {

public static void main(String[] args) {
		
		int i = 10; //기본 데이터 타입, 객체가 아니다
		
		Student studentLee = new Student(100, "이순신"); //힙메모리에 생성 / 객체이다 / 참조형 데이터 타입 studentLee 는 참조변수이다
	/*	studentLee.studentName = "이순신";
		studentLee.studentID = 100; */
		studentLee.address = "서울시 영등포구 영등포동";
		
	/*	Student studentKim = new Student(101); //디폴트 생성자일때 사용 가능
		studentKim.studentName = "김유신";
		studentKim.studentID = 1340;
		studentKim.address = "미국 산호세"; //Lee Kim 둘 다 인스턴스이다 지역변수이기도 하다
	*/	
		studentLee.showStudentInfo();
		//studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		//System.out.println(studentKim);
	}

}
