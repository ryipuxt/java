package starcraft.ver01;

public class Hatchery {

	private int hatcheryNumber;
	private int count;

	public Hatchery(int hatcheryNumber) {
		this.hatcheryNumber = hatcheryNumber;
		count = 0;

	}

	public int getCount() {
		return this.count;
	}
	
	public int getHatcheryNumber() {
		return this.hatcheryNumber;
	}

	public Zergling createZergling(String name) {
		count++;
		return new Zergling(name);
	}

}
