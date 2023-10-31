package abstractEx;

public class ComputerTest {

	public static void main(String[] args) {
		//Computer c1 = new Computer();//추상클래스라 인스턴스화 안됨
		Computer c2 = new Desktop();//업캐스팅은 가능함
		Computer c3 = new MyNoteBook();
		NoteBook c4 = new MyNoteBook();//상위클래스가 두개라서 두 클래스로 업캐스팅이 가능하다
		
		c2.display();
		c4.display();
		System.out.println(c4.productNum(300));
	}

}
