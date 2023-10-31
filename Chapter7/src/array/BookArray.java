package array;

public class BookArray {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book();
		library[2] = new Book("수레바퀴 아래에서", "헤르만 헤세");
		library[3] = new Book("야경", "요네자와 호노부");
		library[4] = new Book();
		
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		for(int i = 0; i <library.length; i++) {
			library[i].showBookInfo();
		} 
		
		//Car[] drive = new Car[5]; //먼저 참조자료형을 만들고 객체 배열을 선언해야한다
	}

}
