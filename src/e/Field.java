package e;

import java.util.Scanner;

public class Field {

	public static void main(String[] args) {
		boolean anchor = true;
		boolean w = true;
		boolean a = true;
		int turn = 1;
		int wPotionCount = 3;
		int aPotionCount = 3;

		Scanner sc = new Scanner(System.in);
		Warrior w1 = new Warrior("야스오", 750, 100, 35);
		Archor a1 = new Archor("애쉬", 550, 75, 15);

		while (anchor) {
			w1.showInfo();
			a1.showInfo();
			System.out.println("----------------------------------------------------------------------");
			System.out.println(turn + "번째 턴");
			while (w) {

				System.out.println("전사 턴");
				System.out.println("행동을 선택하세요");
				System.out.print("1 - 공격 2 - 물약 사용 3 - 공격력 증가 4 - 방어력 증가 : ");
				int commandW1 = sc.nextInt();

				if (commandW1 == 1) {
					w1.Attack(a1);
					w = false;
					a = true;
					if (a1.healthPoint <= 0) {
						anchor = false;
						a = false;
						w = false;
					}
				} else if (commandW1 == 2) {
					if (wPotionCount > 0) {
						w1.usePotion();
						wPotionCount--;
						System.out.println("남은 물약 : " + wPotionCount + "개");
						w = false;
						a = true;
					} else {
						System.out.println("**남은 물약이 없습니다.**");
					}
				} else if (commandW1 == 3) {
					w1.boostDamage();
					w = false;
					a = true;
				} else if (commandW1 == 4) {
					w1.boostDefense();
					w = false;
					a = true;
				} else {
					System.out.println("**잘못된 입력입니다.**");
				}
			}
			System.out.println("----------------------------------------------------------------------");
			while (a) {

				System.out.println("궁수 턴");
				System.out.println("행동을 선택하세요");
				System.out.print("1 - 공격 2 - 물약 사용 3 - 공격력 증가 4 - 방어력 증가 : ");

				int commandA1 = sc.nextInt();

				if (commandA1 == 1) {
					a1.Attack(w1);
					w = true;
					a = false;
					if (w1.healthPoint <= 0) {
						anchor = false;
						a = false;
						w = false;
						break;
					}
				} else if (commandA1 == 2) {
					if (aPotionCount > 0) {
						a1.usePotion();
						aPotionCount--;
						System.out.println("남은 물약 : " + aPotionCount + "개");
						w = true;
						a = false;
					} else {
						System.out.println("**남은 물약이 없습니다.**");
					}
				} else if (commandA1 == 3) {
					a1.boostDamage();
					w = true;
					a = false;
				} else if (commandA1 == 4) {
					a1.boostDefense();
					w = true;
					a = false;
				} else {
					System.out.println("**잘못된 입력입니다.**");
				}
			}
			turn++;
		}
		sc.close();

	}

}
