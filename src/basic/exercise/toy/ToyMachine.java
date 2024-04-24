package basic.exercise.toy;

import java.util.Scanner;

import java.util.Random;

// 클래스 - 인형뽑기
// 상품들 존재 가능
// 사자인형, 곰인형, 에어팟
// 요구 조건
// 배열을 활용해서 객체들을 담아 주세요
public class ToyMachine {

	Scanner sc = new Scanner(System.in);
	Random random = new Random();

	private String toyMachineName;
	private Product[] products;
	private int productCount;
	private final int MAX_TOYS = 10;
	int chance = 0;
	int count1 = 0;
	int a = 1;
	int deleteCount = 0;
	int lionCount = 0;
	int bearCount = 0;
	int airpotCount = 0;
	int totalBearCount = 0;
	int totalLionCount = 0;

	Product airpot = new Airpot();
	Product lion = new Lion();
	Product bear = new Bear();

	public ToyMachine(String toyMachineName) {
		this.toyMachineName = toyMachineName;
		products = new Product[MAX_TOYS];
		this.productCount = 0;
	}

	// 상품 추가
	public void addProduct() {
		if (productCount < MAX_TOYS) {
			products[productCount] = airpot;
			for (int i = 1; i < products.length; i++) {
				productCount++;
				int a = random.nextInt(100);
				if (a >= 0 && a < 50) {
					products[productCount] = lion;
				} else if (a > 50 && a <= 100) {
					products[productCount] = bear;
				}
			}
		} else {
			System.out.println("재고 초과");
		}
		for (int x = 0; x < products.length; x++) {
			if (products[x] instanceof Bear) {
				totalBearCount++;
			} else if (products[x] instanceof Lion) {
				totalLionCount++;
			}
		}
	}

	// 상품 조회
	public void showProducts() {
		System.out.println("-------- 상품 재고 --------");
		for (int i = 0; i < products.length; i++) {
			if (products[i] != null) {
				products[i].showInfo();
			}
		}
	}

// 사용자 뽑기
	public void pull() {
		if (chance < 0) {
			System.out.println("남은 기회가 없습니다.");
			return;
		}
		System.out.println("--------------");
		System.out.println("뽑기를 진행합니다.");
		while (chance > 0) {
			chance -= 1;
			int rNumber = random.nextInt(100);
			if (rNumber <= 15) {
				System.out.println("꽝");
			} else if (rNumber > 15 && rNumber <= 55 && totalBearCount > 1) {
				System.out.println("곰인형을 뽑았습니다.");
				bearCount++;
				totalBearCount--;
				while (deleteCount == 0) {
					if (products[a] instanceof Bear) {
						products[a] = null;
						deleteCount++;
					} else {
						a++;
					}
				}
				deleteCount = 0;
			} else if (rNumber > 55 && rNumber <= 95 && totalLionCount > 1) {
				System.out.println("사자인형을 뽑았습니다.");
				lionCount++;
				totalLionCount--;
				while (deleteCount == 0) {
					if (products[a] instanceof Lion) {
						products[a] = null;
						deleteCount++;
					} else {
						a++;
					}
				}
				deleteCount = 0;
			} else if (rNumber > 95 && airpotCount == 0) {
				System.out.println("축하합니다! 에어팟을 뽑았습니다.");
				airpotCount++;
				products[0] = null;
			} else {
				// System.out.println("해당하는 상품이 없습니다.");
				// System.out.println("뽑기 기회를 1회 돌려드립니다.");
				System.out.println("꽝");
			}
			// }
		}
	}

	// 현재 가지고있는 상품
	public void inventory() {
		System.out.println("--------------");
		System.out.println("현재 가지고있는 상품 목록");
		System.out.println("사자 인형 : " + lionCount + "개");
		System.out.println("곰 인형 : " + bearCount + "개");
		System.out.println("에어팟 : " + airpotCount + "개");

	}

// 돈을 입력 받다
	public void moneyInput() {
		System.out.println("--------------");
		System.out.println("돈을 넣어주세요");
		System.out.println("1000원당 1회, 최대 10번");
		System.out.println("--------------");
		int money = sc.nextInt();
		if (money < 11000) {
			this.chance = (money / 1000);
			int returnMoney = (money % 1000);
			System.out.println(money + "원을 받았습니다.");
			System.out.println(chance + "번 뽑으실 수 있습니다.");
			System.out.println("잔돈 " + returnMoney + "원을 반환합니다.");
		} else {
			System.out.println(money + "원을 받았습니다.");
			while (money > 11000) {
				money -= 1000;
				count1++;
			}
			this.chance = (money / 1000);
			int returnMoney = (money % 1000);
			System.out.println(chance + "번 뽑으실 수 있습니다.");
			System.out.println("잔돈 " + ((count1 * 1000) + returnMoney) + "원을 반환합니다.");
		}
	}

}
