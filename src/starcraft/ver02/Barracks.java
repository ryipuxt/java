package starcraft.ver02;

public class Barracks {

	private int barracksNumber;
	private int count;

	public Barracks(int barracksNumber) {
		this.barracksNumber = barracksNumber;
		count = 0;

	}

	public int getCount() {
		return this.count;
	}
	
	public int getBarracksNumber() {
		return this.barracksNumber;
	}

	public Marine createMarine(String name) {
		count++;
		return new Marine(name);
	}

}
