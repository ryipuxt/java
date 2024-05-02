package structure;

/**
 * 배열을 활용한 클래스를 설계 이미 자바 표준 API 개발자들이 잘 만들어 준 클래스들이 존재 한다. 하지만 직접 기능을 확장해서 만들어
 * 보자.
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
	// 배열 요소의 제일 뒤에 값을 추가하는 기능
	public void addElement(int inputData) {
		// 방어적 코드
		if (count >= ARRAY_SIZE) {
			System.out.println("메모리 공간이 가득 찼습니다.");
			return; // 실행의 제어권 반납
		}
		intArr[count++] = inputData;
		// count++;
	}

	// 지정한 인덱스 번호에 맞는 요소를 출력하는 기능
	public int getElement(int position) {
		// 방어적 코드
		if (position < 0 || position > count - 1) {
			System.out.println("검색 위치 오류. 현재 리스트의 갯수는 " + count + " 개 입니다.");
			return ERROR_NUM;
		}
		return intArr[position];
	}

	// 요소를 전체 출력하는 기능 만들어 주기
	public void printAll() {
		// 방어적 코드
		if (count == 0) {
			System.out.println("출력할 내용이 없습니다.");
			return;
		}

		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}

	}

	// 요소를 전체 삭제하는 기능
	public void removeAll() {
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = 0;
		}
		// 요소의 갯수 상태를 항상 관리하고 처리해야 한다.
		count = 0;
	}

	// 배열의 크기가 아닌 현재 요소의 갯수를 반환
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

	// 배열의 요소를 추가하는 기능
	// 배열의 지정한 인덱스 위치에 값을 삽입 하기
	public void insertElement(int position, int inputData) {
		// 방어적 코드 작성
		if (count >= ARRAY_SIZE) {
			System.out.println("메모리 공간이 가득 찼습니다.");
			return; // 실행의 제어권을 반납
		}
		// 방어적 코드 2
		if (position < 0 || ARRAY_SIZE < position) {
			// 범위를 벗어남
			System.out.println("지정한 인덱스 번호가 잘못 되었습니다.");
			return;
		}
		// 요청값 : position --> 3
		// [11, 12 ,13, [], 14, 15]
		for (int i = count - 1; i >= position; i--) {
			intArr[i + 1] = intArr[i]; // 하나씩
			// intArr[5] = 15 - 수행 1
			// intArr[4] = 14 - 수행 2
		}
		intArr[position] = inputData;
		count++;
	}

	// 지정한 인덱스 번호의 요소를 삭제하는 기능
	public void removeElement(int position) {
		// 방어적 코드
		if (isEmpty()) {
			System.out.println("삭제할 요소가 없습니다.");
		}
		// 인덱스 범위를 잘못 지정했다면 방어적 코드
		if (position < 0 || position >= count) {
			System.out.println("잘못된 요청입니다.");
		}
		// intArr[position]; --> ex) 사용자가 요청한 인덱스 번호는 0번
		// [100] [200] [300] [400]
		// [200] [300] [400] [] : 한 칸씩 앞으로 이동
		for (int i = position; i < count - 1; i--) {
			intArr[i] = intArr[i + 1];
		}
		count--;
	}

}