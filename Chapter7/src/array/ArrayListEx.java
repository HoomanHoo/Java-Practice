package array;
//�л��� ���� ������� ���� ���� ��� - �л��� ������ �и��ؾ���
public class ArrayListEx {

	public static void main(String[] args) {
		
		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 90);
		
		studentLee.showStudentInfo();
		
		System.out.println("===============");
		
		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("korean", 80);
		studentKim.addSubject("math", 76);
		studentKim.addSubject("english", 90);
		
		studentKim.showStudentInfo();
		
	}

}
