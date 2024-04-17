package basic.ch02;

public class TypeConversion {

	public static void main(String[] args) {

		int intDataBox = 100; // 4byte
		double doubleDataBox; // 8byte

		doubleDataBox = intDataBox;
		// 작은 상자에서 큰 상자로 들어가는 개념이다.
		System.out.println(doubleDataBox);
		// 자동 형 변환이다.

		System.out.println("---------------------");

		// 그럼 강제 형 변환이란?
		final double PI = 3.14159;
		// int intBox = PI; 컴파일러가 작은 상자에 큰 값을 넣을수 없다 함
		// 강제로 넣기
		int intBox = (int) PI;
		System.out.println(intBox);
		// 소수점 값은 버림

		// 연습
		double interestRate;
		int discount;

		interestRate = 15.5;
		// discount = <-- 변수에 강제 형 변환해서 값을 넣어 보자.

		discount = (int) interestRate;
		System.out.println(discount);
		System.out.println((int) 7.5);

	}

}
