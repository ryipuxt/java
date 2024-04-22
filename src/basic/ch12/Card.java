package basic.ch12;

public class Card {

	static int cardNumber = 100;
	private int cardId;
	private String cardName;

	public Card(String cardName) {
		this.cardName = cardName;
		this.cardId = cardNumber;
		cardNumber++;
	}

	public static int getCardNumber() {
		return cardNumber;
	}

	public static void setCardNumber(int cardNumber) {
		Card.cardNumber = cardNumber;
	}

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	// 코드 테스트(메인)
	public static void main(String[] args) {
		
		Card card1 = new Card("파랑");
		System.out.println(card1.getCardId());
		
		Card card2 = new Card("빨강");
		System.out.println(card2.getCardId());

		Card card3 = new Card("노랑");
		System.out.println(card3.getCardId());
	}

}
