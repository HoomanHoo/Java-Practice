package loopexample;

public class ForExample {

	public static void main(String[] args) {

		int num;
		int sum = 0;
		int aum = 35;
		
		for(num = 1, sum = 0; num <= 10; num++, aum++) {
			
			sum += num;
			
		}
		System.out.println(sum);
		System.out.println(num);
		System.out.println(aum);
		System.out.println(aum+num);
		
	}

}
