package examplePart;

import java.time.Year;
import java.util.StringTokenizer;

public class StringStudy {

	public static void main(String[] args) {
		//1980년 1월 12일생 44살 남자입니다. 가 출력되어야함 / 뒷자리 첫번째 자리가 3, 4이면 2000년생 이후로 간주해야함
				StringTokenizer st = new StringTokenizer("800112-1111111", "-");
				Year y = Year.now();
				int currentYear = y.getValue();
				StringBuffer sexual = new StringBuffer("사람");
				String birthday = st.nextToken();
				String backNum = st.nextToken();
				
				String birthYear = birthday.substring(0, 2); //1980인지 2080인지 처리해줘야함
				String birthMonth = birthday.substring(2, 4);
				String birthDate = birthday.substring(4);
				String firstNum = backNum.substring(0, 1);
				
				int fNum = Integer.parseInt(backNum.substring(0, 1));
				int bYear = Integer.parseInt(birthYear);
				int bMonth = Integer.parseInt(birthMonth);
				int bDate = Integer.parseInt(birthDate);
				
				if (fNum == 1 || fNum == 3){
					sexual.replace(0, 2,"남자");
				}
				else if (fNum == 2 || fNum == 4){
					sexual.replace(0, 2,"여자");
				}
				else{
					System.out.println("유효하지 않은 주민번호 입니다.");
				}
				
				if (fNum == 1 || fNum == 2){
					bYear += 1900;
				}
				else if (fNum == 3 || fNum == 4){
					bYear += 2000;
				}
				else{
					System.out.println("유효하지 않은 주민번호 입니다.");
				}
				
				int old = (currentYear - bYear) + 1;

				System.out.println(bYear + "년 " + bMonth + "월 " + bDate + "생 " + old + "살 " + sexual + "입니다.");
				
				//1980년 1월 12일생 44살 남자입니다.
	
	}

}
