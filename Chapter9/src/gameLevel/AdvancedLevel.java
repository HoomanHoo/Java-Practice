package gameLevel;

public class AdvancedLevel extends Level {

	@Override
	public void run() {
		System.out.println("fast run");
	}

	@Override
	public void jump() {
		System.out.println("high jump");
	}

	@Override
	public void turn() {
		System.out.println("can`t turn");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("===advanced level===");
	}

}
