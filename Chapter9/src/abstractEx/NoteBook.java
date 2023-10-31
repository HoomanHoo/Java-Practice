package abstractEx;

public abstract class NoteBook extends Computer {

	int proNum;
	
	@Override
	public void display() {
		System.out.println("Notebook display()");
	}
	
	public String productNum(int proNum) {
		this.proNum = proNum;
		return "This product`s number is " + proNum;
		
	}

	

}
