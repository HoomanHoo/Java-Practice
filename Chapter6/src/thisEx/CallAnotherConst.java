package thisEx;

class Person{
	
	String name;
	int age;
	
	public Person() {
/*		name = "이름 없음";
		age = 1; */ //생성자 안에서 또 다른 생성자를 호출할 때는 그 앞에서 다른 어떤 작업도 할 수 없다
		            //인스턴스가 모두 생성된 후에 메모리가 할당이 되는데 작업이 들어가면 안되기 때문이다
		this("이름 없음", 1); //매개변수의 종류와 갯수가 맞으면 알아서 해당 인스턴스를 호출한다
	} //this로 다른 생성자를 호출할 경우 호출된 생성자의 메모리 할당이 끝난 후에 this가 있는 생성자의 메모리 할당이 끝난다
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() { //this는 자기 자신의 메모리 주소를 가지고 있고 이를 반환할 수 있다
		return this;             //데이터 타입은 자기 자신의 클래스명과 같다, 현재 인스턴스의 주소값을 반환한다
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {

		Person p1 = new Person();
		
		System.out.println(p1.name);
		
		System.out.println(p1.returnSelf()); 
	}

}
