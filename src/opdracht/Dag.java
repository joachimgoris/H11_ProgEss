package opdracht;

public enum Dag {
	MAANDAG, DINSDAG, WOENSDAG, DONDERDAG, VRIJDAG, ZATERDAG(true), ZONDAG(true);
	
	private boolean weekend;
	
	private Dag() {
		this.weekend = false;
	}
	private Dag(boolean w) {
		this.weekend = w;
	}
	
	public boolean getWeekend() {
		return weekend;
	}
	
	public String printType() {
		return(this.weekend? "Weekend" : "Week");
	}
}
