package basic.ch13;

import java.util.Random;

public class LottoNumberMaker {

//	private String version = "1.0.0"; 

	// main 함수
	public static void main(String[] args) {

		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");

	}

	// 인스턴스에 속하지 않는 함수 만들기
	public static int makeNumber() {
		// static 함수 안에 멤버 변수를 사용할 수 없다.
		// 메모리가 뜨는 순서 !!
		// System.out.println("ver : " + version);
		Random random = new Random();
		int resultNumber = random.nextInt(45) + 1;// 0 ~ 44

		return resultNumber;
	}

}
