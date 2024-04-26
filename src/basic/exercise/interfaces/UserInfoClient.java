package basic.exercise.interfaces;

public class UserInfoClient {

	public static void main(String[] args) {

		// 사용자에게 정보를 입력하세요 > Scanner 활용
		String inputUserName = "홍길동";
		String inputUserPw = "asd123";
		
		// DTO : 데이터들을 받아서(취합해서) 전달하는 역할을 가지고 있는 인스턴스를 말한다.

		// 데이터를 받아서 UserInfoDao를 구현한 구현 클래스에게 전달하고자 한다.
		// UserInfoMySqlDaoImpl, UserInfoOracleDaoImpl
		// UserInfoDao userInfoDao1 = new UserInfoMySqlDaoImpl();
		UserInfoDao userInfoDao1 = new UserInfoOracleDaoImpl();

		userInfoDao1.insertUserInfo(null);
		userInfoDao1.updateUserInfo(null);
		userInfoDao1.deleteUserInfo(0);
		userInfoDao1.selectUserInfo();

	}

}
