package classpart;

public class Student {

	int studentID; //��� ������ ��Ŭ���� �󿡼� �ۼ��� �Ķ������� ǥ���ȴ�
	String studentName;  //String�� ���ڿ��� �����س��� Ŭ�����̴�
	int grade; //������ ������ ������ ���� �ַ� int�� ����Ѵ�
	String address;
	
	public Student(int id, String name) { //ó�� ��ü ���� �� �Ű�����-�Է°�, �����ڵ尡 �ʿ��� ���
		studentID = id;
		studentName = name; //�����ڵ�� ��ü�� �����ϸ鼭 ����鼭 ������ �ڵ带 �ۼ��ϴ°�
	}
	//public Student() {} //����Ʈ ������ 
		
	 //����Ʈ �����ڴ� �Ű�����, �����ڵ� ���� / �����ڰ� �ϳ��� ������ �����Ϸ��� ���������� ���� 
	
	//�����ڴ� ó�� ��ü�� �����ϸ鼭 �ؾ��ϴ� ��, �ϰ� ���� ���� �����ϴ� ��
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);

	}
	//�ܺο� student�� �̸��� �˷��ִ� �޼ҵ� �ۼ� �޼ҵ� �̸� �ۼ� �� �޼��带 ����ϴ� ���� ���忡���� �̸��� ���ؾ���
	public String getStudentName() {
		
		return studentName;
	}
	
	//student �̸��� �����ϴ� �޼���
	public void setStudentName(String name) {
		studentName = name;
	}
	
	
/*	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentName = "�̼���";
		studentLee.address = "����� ���ʱ� ���ʵ�";
		
		studentLee.showStudentInfo(); */
	
	 
	

}
