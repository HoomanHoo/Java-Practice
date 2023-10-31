package hiding;

 class BirthDayT { //public을 사용할 경우 데이터의 무결성이 손상될 수 있다. 그래서 private를 사용하고 public 메서드를 제공하여 처리를 해준다
	 				//따라서 public으로 쓰였을 때 값이 변경되어 변수-데이터가 클래스에서 문제를 일으킬 수 있는 경우 private를 사용한다
	//int day; //자료형 앞에 아무것도 안 쓰면 default라고 하여 같은 package 내에서는 서로 볼 수 있음(이용할 수 있음)
	//public int month; //public은 클래스 외부에서도 사용할 수 있도록 하는 접근 제어자다
	private int day;
	private int month;
	private int year; //private 으로 접근제어자를 설정하면 해당 클래스 외부에서는 사용할 수 없다
	
	public int getDay() { //private 인자들을 메서드를 이용하여 클래스 외부에서도 사용할 수 있도록 함
		return day;
	}
	public void setDay(int day) {
		

		if(month == 2) {
			if(day < 1 || day > 28) {
				System.out.println("날짜 오류입니다.");
			}
		}
		else {
			this.day = day;
		}
	}
	public int getMonth(int month) {
		
		return month;
	}
	public void setMonth(int month) {

		this.month = month;

	}
	public int getYear() { //get()만 활성시키고 set을 넣지 않는 경우 데이터를 읽기만 할 수 있고 변경할 수는 없다
		return year;
	}
	/*public void setYear(int year) {
		this.year = year;
	}
*/
}

 //public 클래스는 자바 파일 내에서는 하나여야 하며 파일명과 클래스명이 동일해야한다.
public class BirthDay{
	
	public static void main(String[] args) {
		
		BirthDayT day = new BirthDayT();
		//day.month = 2;
		//day.year = 2022;
		//day.day = 30; //잘못된 값
		
		day.setMonth(2);
		day.setDay(30);
		day.setYear(2022);
		
	}
}