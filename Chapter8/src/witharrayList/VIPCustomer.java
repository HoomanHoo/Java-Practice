package witharrayList;

public class VIPCustomer extends Customer{
	
	private double saleRatio;
	private int agentId;
	
	public VIPCustomer() {
		super();//상위 클래스인 Customer을 호출한다
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		System.out.println("VIPCustomer() 호출");
	}
	
	public VIPCustomer(int customerId, String customerName, int agentId) {
		super(customerId, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentId = agentId;
	
	} //상위 클래스인 Customer에 매개변수를 필요로 하는 생성자만 존재하는 경우 
	//하위클래스에서도 매개변수를 가지는 생성자를 만들고 super을 명시적으로 사용해주어야 한다
	public int getAgentId() {
		return agentId;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price - (int)(price*saleRatio);
	}
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 담당 상담원 ID는 " + agentId + " 입니다.";
	}
	
	
	

}
