package basic.ch04;

public class BreakTest2 {

	public static void main(String[] args) {

		int i = 0;
		while (i < 11) {
			i++;
			System.out.println("i의 값 : " + i);
			if ((i % 7) == 0) {
				break; // 중간에 멈추고 반복문 하나를 빠져나옴
				// return; 실행의 제어권을 반납한다.
			}
		}

	}

}
