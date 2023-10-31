package interfaceEx;

import java.io.IOException;


public class SchedulerTset {

	public static void main(String[] args) throws IOException {
		//R이 들어오면 라운드 로빈
		//L이 들어오면 리스트잡으로
		//P가 들어오면 프리오리티얼로케이션으로
		
		
		System.out.println("전화상담 배정 방식을 선택하세요 R, L, P");
		
		int ch = System.in.read();//입력을 받는 기능이다 문자열을 치고 엔터를 누르면 입력이 완료된다
		
		Scheduler scheduler = null;
		
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}
		else if(ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		}
		else if(ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("지원하지 않는 기능입니다.");
			return;
		}
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
