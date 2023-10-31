package classpart;

public class FunctionTest {

	public static void main(String[] args) {

		int num1 = 10;
	    int num2 = 30;  //n1 n2와는 전혀 다른 변수다 이름이 같아도 됨
	    
	    int sum = addNum(num1, num2); //return된 값이 sum에 대입됨
	    System.out.println(sum);
	}
	
	public static int addNum(int n1, int n2) { //함수 선언 n1 n2는 함수 내부에서 새로 선언한 변수이다.
		int result = n1 + n2;  //반환값의 타입과 함수 선언시 타입이 같아야함
		return result;
	} //함수 구현

}
