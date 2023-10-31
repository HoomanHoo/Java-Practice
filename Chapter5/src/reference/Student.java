package reference;

public class Student {
	
	int studentId;
	String studentName; //String 같이 JDK에서 기본 제공하는 자료형 중에서는 NEW 예약어 없이 쓸 수 있는 것이 있다.
	Subject korea; //참조자료형
	Subject math;
	
	public Student() {
		korea = new Subject("국어"); //해당 참조자료형에 대한 인스턴스 생성
		math = new Subject("수학");
		
	}
	
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
		
		korea = new Subject("국어"); //해당 참조자료형에 대한 인스턴스 생성
		math = new Subject("수학");
		
	}

	public void setKorea(int score) {
		//멤버변수.참조자료형()의 구조이다
		korea.setScore(score);
		
		//korea.subjectName = name; //privite 이 아니기 때문에 첫번째 코드와 같은 역할을 한다
	}
	
	public void setMath(int score) { //멤버변수.참조자료형()의 구조이다
		math.setScore(score);
		
	}
	
	public void showStudentInfo() {
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
	}
	
}
