package inharitance;

public class Customer {
	
	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	//private int saleRatio;
	//private int agentId; �Ϲ� �����Դ� �ʿ����� ���� �����̴�
	
	public Customer() {
		super(); //��� �ڹ� Ŭ������ object Ŭ������ ��ӹ޴´�
		customerGrade = "SIRVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer() ȣ��");
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
			
		} ���� ����� �þ�� ��� else if���� ��� �þ�� �ȴ�
		else if(customerGrade == "GOLD") {
			
		}*/ 
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "���� �����" + customerGrade + "�̸� ���ʽ� ����Ʈ��" + bonusPoint + "�Դϴ�";
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
