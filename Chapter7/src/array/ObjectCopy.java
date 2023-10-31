package array;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("태백산맥", "조정래");
		bookArray1[2] = new Book("태백산맥", "조정래");
		
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		//System.arraycopy(bookArray1, 0, bookArray2, 0, 3);//얕은 복사-배열의 메모리 주소만 복사
		
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			
		}
		
		for(int i = 0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setBookName("토지");
		bookArray1[0].setAuthor("박경리");
		
		for(int i = 0; i<bookArray2.length; i++) {//얕은 배열일시 -원 배열이 바뀌니 복사된 배열의 값도 바뀜
			bookArray2[i].showBookInfo();
		}
		
		System.out.println("=================================");
		
		bookArray2[1].setBookName("older");
		bookArray2[1].setAuthor("heming");
		
		for(int i = 0; i<bookArray1.length; i++) {//얕은 배열일시 -복사한 배열을 수정해도 원 배열의 값이 바뀜
			bookArray1[i].showBookInfo();
			}
		
		String[] strArr = {"java", "c", "js"};
		
		for(String lang:strArr) {
			System.out.println(lang);
		}
		
		
		
	}
}
