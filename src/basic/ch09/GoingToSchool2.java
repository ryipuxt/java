package basic.ch09;

import java.util.Scanner;

public class GoingToSchool2 {

	// 메인 함수
	public static void main(String[] args) {

		// 설계된 클래스를 가지고 본인이 의도한 대로 실행의 흐름을 만들어 보자.

		// 스캐너를 활용해서 1번을 누르면 버스를 태워서 실행의 흐름을 만들고'
		// 2번을 누르면 지하철을 태우는 실행의 흐름을 만들어 보자.
		Bus bus1 = new Bus(100);
		Bus bus2 = new Bus(200);
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);
		Student s1 = new Student("티모", 100_000);
		Student s2 = new Student("야스오", 100_000);
		Scanner sc = new Scanner(System.in);
		System.out.print("1번을 눌러 버스, 2번을 눌러 지하철을 선택하세요 : ");
		int x = sc.nextInt();
		if (x == 1) {
			System.out.println("몇번 버스를 타시겠습니까?");
			System.out.print("100, 200          : ");
			int selectBus = sc.nextInt();
			if (selectBus == 100) {
				s1.takeBus(bus1);
				s1.showInfo();
				bus1.showInfo();
			} else {
				s1.takeBus(bus2);
				s1.showInfo();
				bus2.showInfo();
			}
		} else {
			System.out.println("몇번 지하철을 타시겠습니까?");
			System.out.print("1, 2          : ");
			int selectSubway = sc.nextInt();
			if (selectSubway == 1) {
				s1.takeSubway(subway1);
				s1.showInfo();
				subway1.showInfo();
			} else {
				s1.takeSubway(subway2);
				s1.showInfo();
				subway2.showInfo();
			}
		}
		sc.close();
	} // end of main

} // end of class
