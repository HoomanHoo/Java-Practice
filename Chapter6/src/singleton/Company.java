package singleton;

public class Company {
	
	private static Company instance = new Company(); //�����ϰ� ���� �ν��Ͻ���
	 //������ �� �͵� �ƴϰ� �Ժη� ���� �ٲ��� �ȵǱ� ������ private static�� ����Ѵ�
	private Company() {} //�ν��Ͻ��� ���� �����Ǵ� ���� �����ϱ� ���� ���� private �����ڸ� �����

	
	public static Company getInstance() { //instance�� ����ϱ� ���� �޼���
		
		if(instance == null) {
			instance = new Company(); //null ���� ���� �� null�Ͻ� �ν��Ͻ��� �ϳ� �����Ѵ�
		}
		
		return instance;   //static ���� �̿��Ͽ� ���α׷� ����ÿ� �̸� �޸𸮿� �÷��д�
	}
}
