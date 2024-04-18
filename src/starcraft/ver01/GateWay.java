package starcraft.ver01;

public class GateWay {
	
	private int gateWayNumber;
	private int count;
	
	// 기능 - 질럿 생산하는 기능을 만들어 보세요
	
	public GateWay(int gateWayNumber) {
		this.gateWayNumber = gateWayNumber;
		count = 0;
	}
	
	public int getCount() {
		return this.count;
	}
	
	public int getGateWayNumber() {
		return this.gateWayNumber;
	}
	
	public Zealot createZealot(String name) {
		count++;
		return new Zealot(name);
	}

}
