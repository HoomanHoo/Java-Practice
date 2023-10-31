package ExampleStudy;

import java.util.Iterator;
import java.util.Vector;

public class PlayerName implements Runnable{
	
	Vector<String> playerName = null;
	
	public PlayerName(int capacity) {
		playerName = new Vector<String>(capacity);
	}
	
	public void addPName() {
		
		playerName.add("�����");
		playerName.add("������");
		playerName.add("������");
		playerName.add("����ȫ");
		playerName.add("���ؿ�");
		playerName.add("������");
		playerName.add("�̺���");
		playerName.add("���ؿ�");
		playerName.add("�����");
		playerName.add("������");
	}

	@Override
	public void run() {
		Iterator<String> iterator = playerName.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			try {
				Thread.sleep(1100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}
