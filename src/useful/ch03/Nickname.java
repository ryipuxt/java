package useful.ch03;

public class Nickname {

	private String nick;

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		
		if (nick == null) {
			System.out.println("아이디는 null 값일 수 없습니다.");
		}
		if (nick.length() < 5) {
			System.out.println("아이디는 5자 이상이어야 합니다.");
		}
		if (nick.length() > 13) {
			System.out.println("아이디는 13자 이하이어야 합니다.");
		}
		if (!nick.matches("[a-zA-Z_0-9]+")) {
			System.out.println("아이디는 특수문자를 포함할 수 없습니다.");
		}
	}
	
}
