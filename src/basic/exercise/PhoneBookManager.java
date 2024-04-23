package basic.exercise;

import java.util.Scanner;

public class PhoneBookManager {

	final static String YES = "y";
	final static String NO = "n";
	static int LAST_INDEX_NUMBER = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PhoneBook[] phonebooks = new PhoneBook[100];

		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String EDIT = "3";
		final String DELETE_ALL = "4";
		final String SEARCH_BY_NAME = "5";
		final String DELETE_BY_NAME = "6";
		final String END = "0";
		boolean flag = true;
		while (flag) {
			System.out.println(" 메뉴 선택 ");
			System.out.println("1.저장 2.전체조회 3.수정 4.전체삭제 5.선택조회 6.선택삭제 0.종료");
			String selectedNumber = sc.nextLine();

			if (selectedNumber.equals(SAVE)) {
				System.out.println("저장하기");
				save(sc, phonebooks);

			} else if (selectedNumber.equals(SEARCH_ALL)) {
				System.out.println("전체 조회 하기");
				readAll(phonebooks);

			} else if (selectedNumber.equals(EDIT)) {
				System.out.println("수정 하기");
				editNum(sc, phonebooks);

			} else if (selectedNumber.equals(DELETE_ALL)) {
				System.out.println("전체 삭제 하기");
				deleteAll(sc, phonebooks);

			} else if (selectedNumber.equals(SEARCH_BY_NAME)) {
				System.out.println("선택 조회 하기");
				searchByName(sc, phonebooks);

			} else if (selectedNumber.equals(DELETE_BY_NAME)) {
				System.out.println("선택 삭제 하기");
				deleteByName(sc, phonebooks);

			} else if (selectedNumber.equals(END)) {
				System.out.println("프로그램 종료");
				flag = false;

			} else {
				System.out.println("잘못된 선택 입니다.");
			}
		}

	} //

	public static void save(Scanner sc, PhoneBook[] phoneBooks) {
		System.out.println("-----저장하기-----");
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("전화번호를 입력하세요");
		String tel = sc.nextLine();
		PhoneBook phoneBook = new PhoneBook(name, tel);

		if (LAST_INDEX_NUMBER >= phoneBooks.length) {
			System.out.println("더이상 책을 저장할 공간이 없습니다.");
			return;
		}

		for (int i = 0; i < phoneBooks.length; i++) {
			if (phoneBooks[i] == null) {
				phoneBooks[i] = phoneBook;
				LAST_INDEX_NUMBER++;
				break;
			}
		}
		System.out.println("저장이 완료되었습니다.");

	}

	public static void readAll(PhoneBook[] phoneBooks) {
		System.out.println("-----전체 조회하기-----");
		for (int i = 0; i < phoneBooks.length; i++) {
			if (phoneBooks[i] != null) {
				phoneBooks[i].showInfo();
			}
		}
	}

	public static void editNum(Scanner sc, PhoneBook[] phoneBooks) {
		System.out.println("-----전화번호 수정하기-----");
		System.out.println("수정할 전화번호를 입력해주세요");
		String findTel = sc.nextLine();
		boolean isFound = false;

		for (int i = 0; i < phoneBooks.length; i++) {
			if (phoneBooks[i] != null && phoneBooks[i].getPhoneNumber().equals(findTel)) {
				phoneBooks[i].showInfo();
				System.out.println("수정할 전화번호를 입력해주세요");
				String editTel = sc.nextLine();
				phoneBooks[i].setPhoneNumber(editTel);
				phoneBooks[i].showInfo();
				System.out.println("성공적으로 수정되었습니다.");
				isFound = true;
				break;
			}
		}
		if (isFound == false) {
			System.out.println("해당 전화번호는 존재하지 않습니다.");
		}
	}

	public static void deleteAll(Scanner sc, PhoneBook[] phoneBooks) {
		System.out.println("-----전체 삭제하기-----");
		System.out.println("정말로 삭제하시겠습니까?");
		System.out.println("1.y 2.n");
		String confirm = sc.nextLine();
		if (confirm.equals(YES)) {
			for (int i = 0; i < phoneBooks.length; i++) {
				phoneBooks[i] = null;
			}

		} else {
			return;
		}
	}

	public static void searchByName(Scanner sc, PhoneBook[] phoneBooks) {
		System.out.println("-----선택 조회하기-----");
		System.out.println("이름을 입력해주세요");
		String findName = sc.nextLine();
		boolean isFound2 = false;

		for (int i = 0; i < phoneBooks.length; i++) {
			if (phoneBooks[i] != null && phoneBooks[i].getName().equals(findName)) {
				phoneBooks[i].showInfo();
				isFound2 = true;
				break;
			}
		}
		if (isFound2 = false) {
			System.out.println("해당 연락처는 존재하지 않습니다.");
		}
	}

	public static void deleteByName(Scanner sc, PhoneBook[] phoneBooks) {
		System.out.println("-----선택 조회하기-----");
		System.out.println("이름을 입력해주세요");
		String findName2 = sc.nextLine();
		boolean isFound3 = false;

		for (int i = 0; i < phoneBooks.length; i++) {
			if (phoneBooks[i] != null && phoneBooks[i].getName().equals(findName2)) {
				phoneBooks[i] = null;
				isFound3 = true;
				break;
			}
		}
		if (isFound3 = false) {
			System.out.println("해당 연락처는 존재하지 않습니다.");
		}
	}
}
