package examplePart;
import java.time.Year;
import java.util.StringTokenizer;

public class StringStudy2 {

	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("800112-1111111", "-");
		Year y = Year.now();
		
		StringBuffer sexual = new StringBuffer("���");
		String birthday = st.nextToken();
		String backNum = st.nextToken();
		
		int firstNum = Integer.parseInt(backNum.substring(0, 1));
		int birthYear = Integer.parseInt(birthday.substring(0, 2));
		int birthMonth = Integer.parseInt(birthday.substring(2, 4));
		int birthDate = Integer.parseInt(birthday.substring(4));
		
		sexual.replace(0, 2, (firstNum == 1 || firstNum == 3 ? "����" : "����"));
		birthYear += (firstNum == 1 || firstNum == 2 ? 1900 : 2000);
		
		System.out.println(birthYear + "�� " + birthMonth + "�� " + birthDate + "�ϻ� " + 
		(y.getValue() - birthYear + 1) + "�� " + sexual + "�Դϴ�.");
		
	}

}
