package practiceClassPart;

public class WkdTest {

	public static void main(String[] args) {
		
		WeekendPractice wndp = new WeekendPractice();
		WkdPractice wp = new WkdPractice(3, 4, "���� �ȿ�");
		
		System.out.println(wp.callTotal(wndp)); // ��ü�� �Ű������� �޴� ��� ���� �޼ҵ忡�� ��ü�� �������ְ� �ش� ��ü���� �Է����ָ� �ȴ�
		wndp.setStr("�ڰ� ������");
		System.out.println(wp.strAdd(wndp));
		
		int a = 50;
		String d = "�̰� ������� " + a + "�� ������";
		System.out.println(d);
		
		
	}

}
