package gameLevel;

public class BeginnerLevel extends Level {

	@Override
	public void run() {
		System.out.println("slow run");
	}

	@Override
	public void jump() {
		System.out.println("can`t jump");
	}

	@Override
	public void turn() {
		System.out.println("can`t turn");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("===beginner level===");
	}

}
