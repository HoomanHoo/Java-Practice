package classpart;

public class Student {

	int studentID; //멤버 변수는 이클립스 상에서 작성시 파란색으로 표현된다
	String studentName;  //String은 문자열을 구현해놓은 클래스이다
	int grade; //정수형 변수를 선언할 때는 주로 int를 사용한다
	String address;
	
	public Student(int id, String name) { //처음 객체 생성 시 매개변수-입력값, 수행코드가 필요한 경우
		studentID = id;
		studentName = name; //수행코드는 객체를 생성하면서 만들면서 실행할 코드를 작성하는것
	}
	//public Student() {} //디폴트 생성자 
		
	 //디폴트 생성자는 매개변수, 수행코드 없음 / 생성자가 하나라도 있으면 컴파일러가 제공해주지 않음 
	
	//생성자는 처음 객체를 생성하면서 해야하는 일, 하고 싶은 일을 구현하는 것
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);

	}
	//외부에 student의 이름을 알려주는 메소드 작성 메소드 이름 작성 시 메서드를 사용하는 쪽의 입장에서의 이름을 정해야함
	public String getStudentName() {
		
		return studentName;
	}
	
	//student 이름을 변경하는 메서드
	public void setStudentName(String name) {
		studentName = name;
	}
	
	
/*	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.address = "서울시 서초구 서초동";
		
		studentLee.showStudentInfo(); */
	
	 
	

}
