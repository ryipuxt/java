package basic.exercise.test01;

public class MainTest1 {

	public static void main(String[] args) {

		// 문제 1
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		// a 참조변수로 시작해서 D의 name 값을
		// 화면에 출력 하시오.

		System.out.println(a.getB().getC().getD().getName());

	}

}
