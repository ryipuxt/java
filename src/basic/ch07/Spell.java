package basic.ch07;

public class Spell {

	int manaCost;
	int spellDamage;
	String spellName;
	String speellHotKey;
	
	void useSpell() {
		System.out.println(spellName + "주문을 사용합니다.");
	}
	
	void showSpellInfo() {
		System.out.println("---------------주문 정보---------------");
		System.out.println("주문 이름 : " + spellName);
		System.out.print("단축키 : " + speellHotKey + " ");
		System.out.println("마나 : " + manaCost);
		System.out.println("주문 데미지 : " + spellDamage);
	}

}
