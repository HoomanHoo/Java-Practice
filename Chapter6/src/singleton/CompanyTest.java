package singleton;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		
		System.out.println(c1);
		System.out.println(c2);
		
		Calendar cal = Calendar.getInstance(); //calendar도 싱글톤으로 구현되어 있다 시간은 하나밖에 없기 때문이다

	}

}
