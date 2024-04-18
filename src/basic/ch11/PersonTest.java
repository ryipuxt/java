package basic.ch11;

public class PersonTest {

	public static void main(String[] args) {

		Person person1 = new Person("홍길동", 100);
		Person personBox = person1;
		Person personBox2 = person1.getPerson();
		Person personLee = new Person("이순신", 101);
		System.out.println("---------------------------");
		// 위 코드까지는 heap 메모리 영역에 객체가 2개 상성된 상태이다
		// 지역변수인 person1, personBox, personBox2는 같은 객체를 가리킨다
		
		// setName 메서드 만들기
	}

}
