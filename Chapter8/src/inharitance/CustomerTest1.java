package inharitance;

public class CustomerTest1 {

	public static void main(String[] args) {

		Customer customerLee = new Customer();
		customerLee.setCustomerId(1001);
		customerLee.setCustomerName("Lee");
		
		VIPCustomer customerKim = new VIPCustomer(10101, "Kim", 100);
		//Customer customerKim = new VIPCustomer(); ����Ŭ������ �����ص� ����Ŭ���� �ν��Ͻ��� ������ �� ����
		customerKim.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
	}

}
