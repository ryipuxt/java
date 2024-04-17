package basic.exercise;

public class DoubleFor3 {

	public static void main(String[] args) {
		int y = 1;
		for (int i = 1; i < 6; i++) {
			for (int x = 0; x < y; x++) {
				System.out.print("*");
			}
			y += 2;
			System.out.println();
		}
	}

}
