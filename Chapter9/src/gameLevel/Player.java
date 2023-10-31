package gameLevel;

public class Player {
	
	private Level level;
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	};
	
	public void play(int count) {
		level.go(count);
	}

	public Level getLevel() {
		return level;
	}

	public void upgradeLevel(Level level) {
		this.level = level;
		level.showLevelMessage();
	}

}
