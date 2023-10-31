package thisEx;

class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year; //this는 자기 자신을 나타냄 즉 year 자기 자신에다가 year을 넣어라 라는 의미이다
	}					  //this가 없으면 수행식의 두 year는 매개변수의 int year을 참조하게 된다
						  // 좌항과 우항의 이름이 다르고 매개변수의 이름과 우항의 이름이 같을 경우에는 this를 안 써도 됨

	public void printThis() {
		System.out.println(this); //현재 자기 자신(인스턴스)의 주소값을 출력
	}

}

public class ThisExample {

	public static void main(String[] args) {
		
		Birthday b1 = new Birthday();
		Birthday b2 = new Birthday();
		
		System.out.println(b1);
		b1.printThis();
		
		System.out.println(b2);
		b2.printThis();

	}

}
