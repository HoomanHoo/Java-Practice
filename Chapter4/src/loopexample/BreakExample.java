package loopexample;

public class BreakExample {

	public static void main(String[] args) {

		int sum = 0;
		int num = 1;
		
		/*while(sum < 100) {
			sum += num;
			num++;
		} */ //sum이 100과 가장 가까운 값이 되더라도 num 값이 증가하기 때문에 sum 값이 100을 넘기는 순간의 정확한 num값을 구할 수 없다
		
		while(true) {
			sum += num;
			if(sum > 100) { //sum값이 100을 넘기면 break문이 작동하게 되어 이후의 반복문을 수행하지 않고 반복문을 빠져나온다. 
				break;
			}
			
			num++; //sum값이 100을 넘는 순간 break문이 작동하여 num++ 이 실행되지 않기 때문에 sum이 100을 넘기는 순간의 num값을 구할 수 있다.
		}
		
		System.out.println(sum);
		System.out.println(num);
	}

}
