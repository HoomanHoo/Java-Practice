package array;

public class BookArray {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
		library[0] = new Book("�¹���", "������");
		library[1] = new Book();
		library[2] = new Book("�������� �Ʒ�����", "�츣�� �켼");
		library[3] = new Book("�߰�", "����ڿ� ȣ���");
		library[4] = new Book();
		
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		for(int i = 0; i <library.length; i++) {
			library[i].showBookInfo();
		} 
		
		//Car[] drive = new Car[5]; //���� �����ڷ����� ����� ��ü �迭�� �����ؾ��Ѵ�
	}

}
