package loopexample;

public class ForExample2 {

	public static void main(String[] args) {

		for(int i = 0; i < 10; i++) {
			System.out.println("Hello World");
		}
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Hello World");
		} // 두 for문은 같은 결과를 출력하나 현장에서는 0부터 시작해서 특정 수보다 작은 횟수가 되는 조건을 선호한다.
	}

}
