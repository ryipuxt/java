package basic.ch11;

public class Person {

	// this의 3가지 사용방법
	// 1. this 는 자기 자신을 가리킨다(인스턴스의 주소)
	// 2. 생성자에 다른 생성자를 호출할 때 사용할 수 있다.
	// 3. 자신의 주소(참조값, 주소값)를 반환 시킬 수 있다.

	// 변수 --> private
	@SuppressWarnings("unused")
	private String name;
	@SuppressWarnings("unused")
	private int age;
	@SuppressWarnings("unused")
	private String phone;
	@SuppressWarnings("unused")
	private String gender;

	// 생성자
	public Person(String name, int age) {
		// 자기 자신의 멤버 변수 name 외부에서 들어오는 지역 변수 name을 대입
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int age, String phone) {
		// 생성자에서 다른 생성자를 호출할 수 있다 this(...)
		this(name, age);
		// this.age = age;
		this.phone = phone;
		// 다른 생성자를 가장 먼저 호출하고 다른 수식을 작성해야 한다.
	}
	
	public Person(String name, int age, String phone, String gender) {
		this(name, age, phone);
		this.gender = gender;
	}
	
	public Person getPerson() {
		return this;		
	}
	

}
