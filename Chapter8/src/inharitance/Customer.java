package inharitance;

public class Customer {
	
	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	//private int saleRatio;
	//private int agentId; 일반 고객에게는 필요하지 않은 변수이다
	
	public Customer() {
		super(); //모든 자바 클래스는 object 클래스를 상속받는다
		customerGrade = "SIRVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer() 호출");
	}
	
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		customerGrade = "SIRVER";
		bonusRatio = 0.01;
	} 
	
	public int calcPrice(int price) {
		
		/*if(customerGrade == "SIRVER") {
			bonusPoint += price * bonusRatio;
		}
		else if(customerGrade == "VIP") {
			
		} 고객의 등급이 늘어나는 경우 else if문이 계속 늘어나게 된다
		else if(customerGrade == "GOLD") {
			
		}*/ 
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은" + customerGrade + "이며 보너스 포인트는" + bonusPoint + "입니다";
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	

}
