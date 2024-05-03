package structure;

/**
 * 배열을 활용 클래스를 설계 물론 --> 이미 자바 표준 API 개발자들이 잘 만들어 준 클래스 들이 존재 한다. 하지만 직접 기능을
 * 확장해서 만들어 보자.
 */
public class TencoIntArray {

	int[] intArr;
	int count; // 배열안에 들어간 요소의 갯수
	public final int ARRAY_SIZE;
	public static final int ERROR_NUM = -99999999;

	public TencoIntArray() {
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
	}

	public TencoIntArray(int size) {
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[ARRAY_SIZE];
	}

	// 기능 설계
	// 배열 요소에 제일 뒤에 값을 추가하는 기능을 가진다.
	public void addElement(int inputData) {
		// 방어적 코드 필요
		if (count >= ARRAY_SIZE) {
			System.out.println("메모리 공간이 가득 찼습니다.");
			return; // 실행의 제어권을 반납
		}
		intArr[count] = inputData;
		count++;
	}

	// 지정한 인덱스 번호에 요소를 꺼내 주기
	public int getElement(int positon) {
		// 배열에 크기 10
		// [0] [1] [2] --> 3
		if (positon < 0 || positon > count - 1) {
			System.out.println("검색 위치 오류. 현재 리스트의 갯수는 " + count + " 개 입니다.");
			return ERROR_NUM;
		}
		return intArr[positon];
	}

	// 요소를 전체 출력하는 기능 만들어 주기
	public void printAll() {
		if (count == 0) {
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}

	// 전체 삭제 하는 기능
	public void removeAll() {
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = 0;
		}
		// 요소에 갯수 상태를 항상 관리하고 처리해야한다.
		count = 0;
	}

	// 배열에 크기가 아님 현재 요소게 갯수를 반환
	public int getCountSize() {
		return count;
	}

	// 현재 요소가 하나도 없는 상태이다.
	public boolean isEmpty() {
		if (count == 0) {
			return true;
		} else {
			return false;
		}
	}

	// 배열의 지정한 인덱스 위치에 값을 삽입 하기
	public void insertElement(int positon, int inputData) {

		// 방어적 코드 1
		if (count >= ARRAY_SIZE) {
			System.out.println("메모리 공간이 가득 찼습니다.");
			return;
		}

		// 방어적 코드 2
		if (positon < 0 || ARRAY_SIZE < positon) {
			System.out.println("지정한 인덕스 번호가 잘못 되었습니다");
			return;
		}
		// 요청값 : postion -> 3
		// [11, 12, 13, 14, 15]
		// [11, 12, 13, [], 14, 15]
		for (int i = count - 1; i >= positon; i--) {
			intArr[i + 1] = intArr[i]; // 하나씩
			// intArr[5] = 15; 수행 1
			// intArr[4] = 14; 수행 2
		}
		intArr[positon] = inputData;
		count++;
	}

	// 지정한 인덱스 번호에 요소를 삭제하기
	public void removeElement(int positon) {

		if (isEmpty()) {
			System.out.println("삭제 할 요소가 없습니다");
		}
		// position : 2 <--- 넘겨 받은 값
		System.out.println("Log 2 : " + count);
		// 인덱스 범위를 잘못 지정했다면 방어적 코드
		if (positon < 0 || positon >= count) {
			System.out.println("잘못된 요청 입니다.");
		}
		// 0 1 2
		// [100] [200] [300] [0]

		// 2 3 ---> 횟수로는 한번 반복한다.
		for (int i = positon; i < count; i++) {
			// 2 = intArr[3]
			System.out.println("deleted " + intArr[i]);
			intArr[i] = intArr[i + 1];
			// [100] [200] [0] [0]
		}
		count--;
	}

}
