package basic.ch02;

public class DiscountCalciatory {

	public static void main(String[] args) {
		// 상수 선언 - 원가, 할인율
		final double OGPRICE = 59.99;
		final double DISCOUNT = 0.3;

		// 할인된 가격 = 원가 x (1 - 할인율)
		// 할인된 가격 계산 하기 (비지니스 로직)
		double discountedPrice = OGPRICE - (1 - DISCOUNT);

		// 최종 가격을 정수형으로 형 변환 처리
		int finalPrice = (int) discountedPrice;
		// 결과 출력
		System.out.println("최종 가격 : " + finalPrice);
		System.out.println("최종 가격(소수점) : " + discountedPrice);

	}

}
