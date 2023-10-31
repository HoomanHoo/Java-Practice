package loopexample;

public class ContinueExample2 { // 1. 구구단 중 짝수 단만 출력하기   2. 구구단중 단보다 작거나 같은 수까지만 곱하는 경우만 출력하라

	public static void main(String[] args) {

		int dan = 2;
		int times = 1;
		
		/*while(dan <= 9) {   //문제 1의 답
			
			if((dan % 2) != 0) {
				dan++;
				continue;
			}
			times = 1;
			while(times <= 9) {
				
				System.out.println(dan + "X" + times + "=" + dan*times);
				times++;
			}
			dan++;
			System.out.println(); 
			
		}*/
		
		while(dan <= 9) { //문제 2의 답
			times = 1;
			while(times <= 9) {
				if(times > dan) {
					times++;
					continue; //times++와 continue; 대신 break;도 사용할 수 있다.
				}
				
				System.out.println(dan + "X" + times + "=" + dan*times);
				times++;
			}
			dan++;
			System.out.println();
		}
		
		
		
		
		
	}

}
