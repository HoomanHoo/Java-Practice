package inharitance;

public class CustomerTest1 {

	public static void main(String[] args) {

		Customer customerLee = new Customer();
		customerLee.setCustomerId(1001);
		customerLee.setCustomerName("Lee");
		
		VIPCustomer customerKim = new VIPCustomer(10101, "Kim", 100);
		//Customer customerKim = new VIPCustomer(); 상위클래스로 선언해도 하위클래스 인스턴스를 생성할 수 있음
		customerKim.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
	}

}
