package hiding;

 class BirthDayT { //public�� ����� ��� �������� ���Ἲ�� �ջ�� �� �ִ�. �׷��� private�� ����ϰ� public �޼��带 �����Ͽ� ó���� ���ش�
	 				//���� public���� ������ �� ���� ����Ǿ� ����-�����Ͱ� Ŭ�������� ������ ����ų �� �ִ� ��� private�� ����Ѵ�
	//int day; //�ڷ��� �տ� �ƹ��͵� �� ���� default��� �Ͽ� ���� package �������� ���� �� �� ����(�̿��� �� ����)
	//public int month; //public�� Ŭ���� �ܺο����� ����� �� �ֵ��� �ϴ� ���� �����ڴ�
	private int day;
	private int month;
	private int year; //private ���� ���������ڸ� �����ϸ� �ش� Ŭ���� �ܺο����� ����� �� ����
	
	public int getDay() { //private ���ڵ��� �޼��带 �̿��Ͽ� Ŭ���� �ܺο����� ����� �� �ֵ��� ��
		return day;
	}
	public void setDay(int day) {
		

		if(month == 2) {
			if(day < 1 || day > 28) {
				System.out.println("��¥ �����Դϴ�.");
			}
		}
		else {
			this.day = day;
		}
	}
	public int getMonth(int month) {
		
		return month;
	}
	public void setMonth(int month) {

		this.month = month;

	}
	public int getYear() { //get()�� Ȱ����Ű�� set�� ���� �ʴ� ��� �����͸� �б⸸ �� �� �ְ� ������ ���� ����
		return year;
	}
	/*public void setYear(int year) {
		this.year = year;
	}
*/
}

 //public Ŭ������ �ڹ� ���� �������� �ϳ����� �ϸ� ���ϸ�� Ŭ�������� �����ؾ��Ѵ�.
public class BirthDay{
	
	public static void main(String[] args) {
		
		BirthDayT day = new BirthDayT();
		//day.month = 2;
		//day.year = 2022;
		//day.day = 30; //�߸��� ��
		
		day.setMonth(2);
		day.setDay(30);
		day.setYear(2022);
		
	}
}