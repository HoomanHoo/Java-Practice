package thisEx;

class Person{
	
	String name;
	int age;
	
	public Person() {
/*		name = "�̸� ����";
		age = 1; */ //������ �ȿ��� �� �ٸ� �����ڸ� ȣ���� ���� �� �տ��� �ٸ� � �۾��� �� �� ����
		            //�ν��Ͻ��� ��� ������ �Ŀ� �޸𸮰� �Ҵ��� �Ǵµ� �۾��� ���� �ȵǱ� �����̴�
		this("�̸� ����", 1); //�Ű������� ������ ������ ������ �˾Ƽ� �ش� �ν��Ͻ��� ȣ���Ѵ�
	} //this�� �ٸ� �����ڸ� ȣ���� ��� ȣ��� �������� �޸� �Ҵ��� ���� �Ŀ� this�� �ִ� �������� �޸� �Ҵ��� ������
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() { //this�� �ڱ� �ڽ��� �޸� �ּҸ� ������ �ְ� �̸� ��ȯ�� �� �ִ�
		return this;             //������ Ÿ���� �ڱ� �ڽ��� Ŭ������� ����, ���� �ν��Ͻ��� �ּҰ��� ��ȯ�Ѵ�
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {

		Person p1 = new Person();
		
		System.out.println(p1.name);
		
		System.out.println(p1.returnSelf()); 
	}

}
