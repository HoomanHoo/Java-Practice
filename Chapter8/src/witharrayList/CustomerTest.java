package witharrayList;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(1001, "Lee");
		Customer customerKim = new Customer(1002, "Kim");
		GoldCustomer customerPark = new GoldCustomer(10004, "Park");
		GoldCustomer customerChoi = new GoldCustomer(10005, "Choi");
		VIPCustomer customerHong = new VIPCustomer(10023, "Hong", 10223);
		
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerPark);
		customerList.add(customerChoi);
		customerList.add(customerHong);
		
		System.out.println("============");
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("======�������� ���ʽ� ����Ʈ======");
		
		int price = 10000;
		for(Customer customer : customerList) {
			
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "����" + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(customer.showCustomerInfo());
		}
	}

}
