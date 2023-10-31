package interfaceEx;

public class PriorityAllocation implements Scheduler{
	
	public void getNextCall() {
		System.out.println("고객의 등급이 높은 고객의 전화를 먼저 가져옵니다.");
	
	}
	
	public void sendCallToAgent() {
		System.out.println("업무 스킬이 가장 좋은 상담원의 대기열에 우선 배분합니다.");
	}

}
