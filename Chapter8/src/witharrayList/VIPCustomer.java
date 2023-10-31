package witharrayList;

public class VIPCustomer extends Customer{
	
	private double saleRatio;
	private int agentId;
	
	public VIPCustomer() {
		super();//���� Ŭ������ Customer�� ȣ���Ѵ�
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		System.out.println("VIPCustomer() ȣ��");
	}
	
	public VIPCustomer(int customerId, String customerName, int agentId) {
		super(customerId, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentId = agentId;
	
	} //���� Ŭ������ Customer�� �Ű������� �ʿ�� �ϴ� �����ڸ� �����ϴ� ��� 
	//����Ŭ���������� �Ű������� ������ �����ڸ� ����� super�� ��������� ������־�� �Ѵ�
	public int getAgentId() {
		return agentId;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price - (int)(price*saleRatio);
	}
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " ��� ���� ID�� " + agentId + " �Դϴ�.";
	}
	
	
	

}
