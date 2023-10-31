package array;
//학생이 들은 과목들의 성적 총점 계산 - 학생과 과목을 분리해야함
public class ArrayListEx {

	public static void main(String[] args) {
		
		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 90);
		
		studentLee.showStudentInfo();
		
		System.out.println("===============");
		
		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("korean", 80);
		studentKim.addSubject("math", 76);
		studentKim.addSubject("english", 90);
		
		studentKim.showStudentInfo();
		
	}

}
