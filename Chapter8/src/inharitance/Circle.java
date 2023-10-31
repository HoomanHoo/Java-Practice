package inharitance;

public class Circle {
	
	private int x;
	private int y;
	
	Point point; // Point 클래스의 참조변수를 가져다 씀 = 합성의 방법
	
	private int radius;
	
	public Circle() {
		point = new Point();
	}

}
