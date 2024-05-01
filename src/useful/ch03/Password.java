package useful.ch03;

public class Password {

	private String pwd;

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {

		if (pwd == null) {
			System.out.println("비밀번호는 null 값일 수 없습니다.");
		}
		if (pwd.length() < 5) {
			System.out.println("비밀번호는 5자 이상이어야 합니다.");
		}
		// 정규 표현식을 사용할 수 있다.
		// pwd <== a~z, A~Z > true
		// pwd <== a, 10, ! > false
		if (pwd.matches("[a-zA-Z]+")) {
			System.out.println("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
		}
	}

}
