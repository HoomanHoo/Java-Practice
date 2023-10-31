package ifexample;

public class ifExample2 {
	
	public static void main(String[] args) {
		
		/*int age = 9;
		int charge = 0;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("미취학 아동입니다.");
		}
		else if(age <14) {
			charge = 2000;
			System.out.println("초등학생 입니다.");
		}
		else if(age <20) {
			charge = 2500;
			System.out.println("중, 고등학생 입니다.");
		}
		else {
			charge = 3000;
			System.out.println("일반인 입니다.");
		}
		System.out.println("입장료는"+ charge + "원 입니다."); */
		
		int a = 3;
		int b = 6;
		int max;
		
		if (a > b) {
			max = a;
		}
		else {
			max = b;
		}
		System.out.println(max);
		
		max = 0;
		System.out.println(max);
		
		max = (a>b) ? a : b;
		
		System.out.println(max); //if-else문 중 간단한 구문은 조건 연산자로도 구현이 가능하다.
		
	}

}
