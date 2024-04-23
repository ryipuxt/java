package starcraft.ver02;

import java.util.Scanner;

public class StarcraftTest2 {

	public static void main(String[] args) {

		final int ZEALOT = 1;
		final int MARINE = 2;
		final int ZERGLING = 3;
		final int GAME_END = 0;

		GateWay gateway1 = new GateWay(1);
		GateWay gateway2 = new GateWay(2);
		
		Zealot zealot1 = gateway1.createZealot("질럿1");
		Zealot zealot2 = gateway1.createZealot("질럿2");
		
		System.out.println(gateway1.getGateWayNumber() + " : " + gateway1.getCount());
		System.out.println(gateway2.getGateWayNumber() + " : " + gateway2.getCount());
		
		Hatchery hatchery1 = new Hatchery(1);
		Hatchery hatchery2 = new Hatchery(2);
		
		Zergling zergling1 = hatchery1.createZergling("저글링1");
		Zergling zergling2 = hatchery2.createZergling("저글링2");
		
		System.out.println(hatchery1.getHatcheryNumber() + " : " + hatchery1.getCount());
		System.out.println(hatchery2.getHatcheryNumber() + " : " + hatchery2.getCount());

		Barracks barracks1 = new Barracks(1);
		Barracks barracks2 = new Barracks(2);
		
		Marine marine1 = barracks2.createMarine("마린1");
		Marine marin2 = barracks2.createMarine("마린2");
		
		System.out.println(barracks1.getBarracksNumber() + " : " + barracks1.getCount());
		System.out.println(barracks2.getBarracksNumber() + " : " + barracks2.getCount());
		
		Scanner sc = new Scanner(System.in);
		int unitChoice = -1;

		System.out.println("유닛을 확인하세요");
		System.out.println("1.질럿\t 2.마린\t 3.저글링\t 0.게임종료");
		unitChoice = sc.nextInt();

		if (unitChoice == ZEALOT) {

		} else if (unitChoice == MARINE) {

		} else if (unitChoice == ZERGLING) {

		} else {
			System.out.println("프로그램을 공료 합니다.");
			unitChoice = GAME_END;
		}
		
		sc.close();

	}

}
