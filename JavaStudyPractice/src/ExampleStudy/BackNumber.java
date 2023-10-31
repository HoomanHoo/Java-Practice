package ExampleStudy;

import java.util.Iterator;
import java.util.Vector;

public class BackNumber extends Thread{
	
	Vector <Integer> backNumber = null;
	
	public BackNumber(int capacity) {
		 backNumber = new Vector<Integer>(capacity);
	}
	
	public void addVector() {	
		for (int i = 0; i < 10; i++) {
			backNumber.add(i+1);
		}
	}
	
	public void run() {
		Iterator<Integer> iterator = backNumber.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
