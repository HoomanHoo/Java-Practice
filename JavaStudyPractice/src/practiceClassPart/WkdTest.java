package practiceClassPart;

public class WkdTest {

	public static void main(String[] args) {
		
		WeekendPractice wndp = new WeekendPractice();
		WkdPractice wp = new WkdPractice(3, 4, "잠이 안와");
		
		System.out.println(wp.callTotal(wndp)); // 객체를 매개변수로 받는 경우 실행 메소드에서 객체를 생성해주고 해당 객체명을 입력해주면 된다
		wndp.setStr("자고 싶은데");
		System.out.println(wp.strAdd(wndp));
		
		int a = 50;
		String d = "이걸 어따쓸지 " + a + "번 생각중";
		System.out.println(d);
		
		
	}

}
