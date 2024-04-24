package basic.ch21;

// 추상 클래스를 상속한 경우
// 2가지 해결 방법
// 1. 자식클래스를 추상 클래스로 만들어 버린다.
// 2. 추상 메서드를 오버라이드 해서 구현 메서드로 재정의 한다.

public abstract class Human extends Animal {
	
	
	@Override
	public void move() {
		System.out.println("사람이 움직입니다.");
	}

}
