package basic.exercise;

public class PhoneBook {
	
	private String phoneNumber;
	private String name;
	
	public PhoneBook(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getName() {
		return name;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showInfo() {
		System.out.println(name + ", " + phoneNumber);
	}

}
