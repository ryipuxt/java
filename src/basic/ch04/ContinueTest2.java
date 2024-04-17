package basic.ch04;

public class ContinueTest2 {

	public static void main(String[] args) {

		int i = 0;
		boolean flag = true;
		// 풀이 - 2 : 특정 조건이 되었을 때 반복문을 멈추어라
		while (flag) {

			if (i % 3 == 0) {
				System.out.println("3의 배수 : " + i);
			}
			if (i == 100) {
				flag = false;
				// i ==100
			}
			i++; // i == 101
		}

		// 풀이 1
//		while (i < 101) {
//			i++;
//			if ((i % 3) == 0) {
//				System.out.println(i);
//			}
//		}
	} // end of main

}
// end of class
