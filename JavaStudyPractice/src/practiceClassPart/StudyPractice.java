package practiceClassPart;

public class StudyPractice {

	public static void main(String[] args) {
		Study st = new Study(); //study 클래스를 만들어서 객체를 선언해라
		st.forTest(3, 3); // 이중 for문을 사용한다 24 출력
		
		st.whileTest(10); // while문을 사용하여 매개변수가 5보다 작을 때는 "5번 출력됩니다" 5회 출력되도록 하고
	}					 //매개변수가 5 이거나 5보다 클 때는 "10번 출력합니다" 10회 출력되도록 한 뒤 
						 //"0부터 매개변수 까지의 모든 수를 더한 결과는 sum 입니다" 라고 출력되도록 하기
						//"10번 출력합니다" 10회 출력, 모든 수를 더한 결과는 55
}


/* 연습 1. Study 클래스를 만들고 int형 매개변수 num, num2를 받는 forTest 메소드를 만든다.
 * forTest 메소드는 1부터 num2까지의 모든 수를 더하는 작업을 num번 한 뒤, 그 값에 1부터 num까지의 수를 모두 더해서 출력하는 기능을 한다
 * StudyPractice 클래스를 만들고 이 클래스에서 forTest 메소드를 실행한다
 * 
 * 연습 2. Study 클래스에 int형 매개변수 num을 받는 whileTest 메소드를 만든다
 * 매개변수 num 값이 5보다 작을 때는 "5번 출력됩니다" 를 5번 출력되도록 만들고,
 * 매개변수 num 값이 5 이상일 때는 "10번 출력합니다" 를 10번 출력되도록 만든 뒤에 "0부터 num까지의 모든 수를 더한 결과는 sum 입니다" 라고 출력되도록 하기
 * StudyPractice 클래스에서 whileTest 메소드를 실행한다
 * 
 * 사용된 변수는 다음과 같다 
 * int sum = 0;
 * int sum2 = 0;
 * int a = 0;
 * forTest의 매개변수 num = 3, num2 = 3
 * whileTest의 매개변수 num = 10
 */

