package loopexample;

public class WhileEx {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
		/*while(num <= 10) { //while 문을 계속 수행할 필요가 있는 경우 (프로그램이 종료되지 말아야 하는경우) 조건식에 true를 집어넣는다 종료해야 하는 경우 break문을 사용한다.
			
			sum += num;
			num++;
		} */
		
		do { //do-while문은 수행문이 앞에 있기 때문에 먼저 수행문이 실행되고 조건식을 체크한 뒤 다시 수행문을 실행할지 결정한다.
			sum += num;
			num++;
		} while(num <= 10);
		
		System.out.println("1부터 10까지의 합은 " + sum +" 입니다.");
	}

}
