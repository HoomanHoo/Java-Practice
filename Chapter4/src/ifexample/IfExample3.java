package ifexample;

public class IfExample3 {

	public static void main(String[] args) {
		
		int rank = 1;
		char medalColor;
		
		if(rank == 1) {
			medalColor = 'G';
		}
		else if(rank == 2) {
			medalColor = 'S';
		}
		else if(rank == 3) {
			medalColor = 'B';
		}
		else {
			medalColor = 'A';
		}
		System.out.println(medalColor);

	}

}
