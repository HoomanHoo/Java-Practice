package inharitance;

public class OverridingTest {

	public static void main(String[] args) {
	/*	Customer customerLee = new Customer(1001, "lee");
		customerLee.calcPrice(10000);
		System.out.println(customerLee.showCustomerInfo());
		
		int price = customerLee.calcPrice(10000);
		System.out.println("paid money is " + price + " and " + customerLee.showCustomerInfo());
		
		VIPCustomer customerKim =  new VIPCustomer(10010, "kim", 100);
		customerKim.calcPrice(10000);
		System.out.println(customerKim.showCustomerInfo());
		
		price = customerKim.calcPrice(10000);
		System.out.println("paid money is " + price + " and " + customerKim.showCustomerInfo());
		*/
		
		Customer customerWho = new VIPCustomer(10020, "Who", 100);
		int price = customerWho.calcPrice(10000);
		System.out.println("paid money is " + price + " and " + customerWho.showCustomerInfo());
	}

}
