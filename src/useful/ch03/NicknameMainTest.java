package useful.ch03;

public class NicknameMainTest {

	public static void main(String[] args) {
		
		Nickname nickname = new Nickname();
		
		String inputNick = null;
		inputNick = "a5d4864a6dwa548b!";
		
		try {
			nickname.setNick(inputNick);
		} catch (NicknameException e) {
			System.out.println("우리가 정의한 nickname 예외가 발생");
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
	}
}
