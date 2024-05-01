package useful.ch03;

public class ArrayExceptionHandling {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 크기를 인덱스가 벗어남");
			// System.out.println(e.getMessage());
		}

		System.out.println("비정상 종료되지 않았어요");
	}

}
