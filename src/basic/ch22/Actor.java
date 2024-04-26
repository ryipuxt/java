package basic.ch22;

public class Actor implements Romeo {
	
	String name;
	
	public Actor(String name) {
		this.name = name;
	}

	@Override
	public void performAsRomeo() {
		System.out.println(name + " 가 연극을 합니다.");
		
	}

}
