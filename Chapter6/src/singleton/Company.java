package singleton;

public class Company {
	
	private static Company instance = new Company(); //유일하게 사용될 인스턴스다
	 //여러개 쓸 것도 아니고 함부로 값이 바뀌어서도 안되기 때문에 private static을 사용한다
	private Company() {} //인스턴스가 마구 생성되는 것을 방지하기 위해 직접 private 생성자를 만든다

	
	public static Company getInstance() { //instance를 사용하기 위한 메서드
		
		if(instance == null) {
			instance = new Company(); //null 리턴 방지 및 null일시 인스턴스를 하나 생성한다
		}
		
		return instance;   //static 예약어를 이용하여 프로그램 실행시에 미리 메모리에 올려둔다
	}
}
