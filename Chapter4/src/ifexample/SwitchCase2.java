package ifexample;

public class SwitchCase2 {

	public static void main(String[] args) {
		int rank = 5;
		char medalColor;
		
		switch(rank) {
			case 1: medalColor = 'G';
				break;					//break문이 빠지면 다음 break문이 있는 곳 까지 코드가 실행이 된다. 
			case 2 : medalColor = 'S';
				break;
			case 3 : medalColor = 'B';
				break;
			default: medalColor = 'A';
		}
		System.out.println(rank + "등 메달의 색깔은" + medalColor + "입니다.");
	}

}
