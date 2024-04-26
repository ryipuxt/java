package basic.ch22;

public class Turtle implements RaceParticipant{

	private final int speed = 2;

	@Override
	public String getName() {
		return "거북이";
	}

	@Override
	public int getSPeed() {
		return speed;
	}
}
