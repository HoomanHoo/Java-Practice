package abstractEx;

public class ComputerTest {

	public static void main(String[] args) {
		//Computer c1 = new Computer();//�߻�Ŭ������ �ν��Ͻ�ȭ �ȵ�
		Computer c2 = new Desktop();//��ĳ������ ������
		Computer c3 = new MyNoteBook();
		NoteBook c4 = new MyNoteBook();//����Ŭ������ �ΰ��� �� Ŭ������ ��ĳ������ �����ϴ�
		
		c2.display();
		c4.display();
		System.out.println(c4.productNum(300));
	}

}
