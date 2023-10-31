package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		char[] alpa = new char[26];
		
		char ch = 'A'; //a는 자바 내부 정수값으로 65이다
		
		for(int i = 0; i<alpa.length; i++, ch++) {
			alpa[i] = ch;
		}
		
		for(int i = 0; i<alpa.length; i++, ch++) {
			System.out.println(alpa[i]);
		}
	}

}
