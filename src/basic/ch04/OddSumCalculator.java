package basic.ch04;

import java.util.Scanner;

public class OddSumCalculator {

	public static void main(String[] args) {
		// 사용자의 입력값을 받아서 1부터 x 까지 숫자에 홀수를 덧셈하고 출력하시오.

		Scanner sc = new Scanner(System.in);
		System.out.print("정수값을 입력 하세요 : ");
		int maxNumber = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= maxNumber; i += 2) {

			sum = sum + i;
			System.out.println("sum : " + sum + "\t");

		}
		System.out.println("sum : " + sum);
		
		sc.close();

	} // end of main

} // end of class
