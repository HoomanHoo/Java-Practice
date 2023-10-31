package loopexample;

public class nineExample {

	public static void main(String[] args) {

		/*int dan;
		int times;
		
		for(dan = 2; dan <= 9; dan++) {
			
			for(times = 1; times <= 9; times++) {
				System.out.println(dan + "X" + times + "=" + dan*times);
			}
			System.out.println(); //print와 println의 차이는 ln이 개행을 한다는 것이 차이점이다. println은 공백도 출력시킨다. print는 공백 출력시 print("")울 사용한다
		} */
		
		int dan = 2;
		int times = 1;
		
		while(dan <= 9) {
			
			while(times<=9) {
				System.out.println(dan + "X" + times + "=" + dan*times);
				times++;
			}
			dan++;
			times=1;  //while문은 for문과 다르게 중첩 반복문을 만들 때 초기화를 꼭 시켜주어야 한다.
			System.out.println();
		}
	}

}
