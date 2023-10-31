package ExampleStudy;

import java.util.Iterator;
import java.util.Vector;

public class PlayerName implements Runnable{
	
	Vector<String> playerName = null;
	
	public PlayerName(int capacity) {
		playerName = new Vector<String>(capacity);
	}
	
	public void addPName() {
		
		playerName.add("±è¿õºó");
		playerName.add("±èÅÂÁø");
		playerName.add("±èÇı¼º");
		playerName.add("ÀÌÀçÈ«");
		playerName.add("½ÅÁØ¿ì");
		playerName.add("±èÁÖÇü");
		playerName.add("ÀÌº´±Ô");
		playerName.add("±èÁØ¿Ï");
		playerName.add("±è°ÇÈñ");
		playerName.add("Àüº´¿ì");
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
