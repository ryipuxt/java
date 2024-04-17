package basic.ch06;

public class Group1 {

	public static void main(String[] args) {

		greet("방민석");
		System.out.println(square(99));
		System.out.println(chechAdult(18));
		System.out.println(signOfNumber(-7));
		System.out.println(findMax(-99, 98));

	}

	static void greet(String name) {
		System.out.println("안녕하세요," + name + "님!");
	}

	static int square(int n1) {
		int result;
		result = n1 * n1;
		return result;
	}

	static boolean chechAdult(int age1) {
		boolean result;
		if (age1 >= 18) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
			result = true;
		} else {
			result = false;
		}
		return result;
	}

	static String signOfNumber(int sNum) {
		String result;
		if (sNum > 0) {
			result = ("positive");
		} else if (sNum < 0) {
			result = ("negative");
		} else {
			result = ("zero");
		}
		return result;
	}

	static int findMax(int num1, int num2) {
		int max;
		max = (num1 > num2 ? num1 : num2);
		return max;
	}
}
