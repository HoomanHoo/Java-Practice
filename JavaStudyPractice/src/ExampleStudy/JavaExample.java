package ExampleStudy;

public class JavaExample {

	public static void main(String[] args) {
		BackNumber bn = new BackNumber(10);
		PlayerName pn = new PlayerName(10);
		Thread thread2 = new Thread(pn);
		
		bn.addVector();
		pn.addPName();
		
		bn.start();
		thread2.start();
		
	}

}
