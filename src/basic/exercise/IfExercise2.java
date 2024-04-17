package basic.exercise;

import java.util.Scanner;

public class IfExercise2 {

	// 코드의 시작점
	public static void main(String[] args) {

		// 정수값 입력 받기 활용해 코드의 흐름을 만들어주세요

		// 조건문을 완성하세요
		// 90점 이상 -> A 학점 입니다.
		// 80점 이상 -> B 학점 입니다.
		// 70점 이상 -> C 학점 입니다.
		// 60점 이상 -> D 학점 입니다.
		// 59점 이하 -> F 학점 입니다.

		System.out.println("성적을 입력하세요 (0-100)");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		char grade = 'X';

		String message = "";

		if (score > 100 || score < 0) {
			message = "잘못된 입력입니다. 성적은 0에서 100 사이로 입력해주세요";
			System.out.println(message);
		} else if (score >= 90 && score <= 100) {
			grade = 'A';
			message = "A 학점 입니다. 우수한 성적이네요! 계속 좋은 성적 유지하길 바랍니다.";
			System.out.println(message);
		} else if (score >= 80 && score < 90) {
			grade = 'B';
			message = "B 학점 입니다. 좋은 성적입니다. 조금만 더 노력하면 A도 가능해요!";
			System.out.println(message);
		} else if (score >= 70 && score < 80) {
			grade = 'C';
			message = "C 학점 입니다. 괜찮은 성적이지만, 더 높은 등급을 위해 노력해봅시다.";
			System.out.println(message);
		} else if (score >= 60 && score < 70) {
			grade = 'D';
			message = "D 학점 입니다. 학습에 더 집중할 필요가 있어요. 도움이 필요하면 말해주세요.";
			System.out.println(message);
		} else if (score < 60) {
			grade = 'F';
			message = "F 학점 입니다. 불합격입니다. 부족한 부분을 파악하고, 추가 학습이 필요해요.";
			System.out.println(message);
		} // end of if
		sc.close();

	} // end of main

} // end of class
