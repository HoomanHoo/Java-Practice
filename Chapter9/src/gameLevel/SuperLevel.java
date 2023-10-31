package gameLevel;

public class SuperLevel extends Level {

	@Override
	public void run() {
		System.out.println("fastest run");
	}

	@Override
	public void jump() {
		System.out.println("highest run");
	}

	@Override
	public void turn() {
		System.out.println("turn around");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("===super level===");
	}

}
