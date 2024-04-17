package e;

public class Warrior {

	String name;
	int healthPoint;
	int attackDamage;
	int defense;
	int maxHealthPoint;

	public Warrior(String a, int hp, int ad, int def) {
		name = a;
		healthPoint = hp;
		attackDamage = ad;
		defense = def;
		maxHealthPoint = hp;
	}

	public void Attack(Archor archor) {
		System.out.println("궁수를 공격(" + (this.attackDamage - archor.defense) + ") 합니다");
		archor.beAttacked(this.attackDamage); // 호출
	}

	// 내가 공격을 받다.
	public void beAttacked(int attackDamage) {
		// 방어적 코드
		healthPoint = healthPoint - ((attackDamage - defense) * 3);
		if (healthPoint <= 0) {
			System.out.println("이미 죽었습니다.");
			return; // 실행에 흐름을 반환
		}
	}

	public void usePotion() {
		healthPoint = healthPoint + (int) (maxHealthPoint * 0.15);
		if (healthPoint > maxHealthPoint) {
			healthPoint = maxHealthPoint;
		}
	}

	public void boostDamage() {
		attackDamage = (int) (attackDamage * 1.2);
	}

	public void boostDefense() {
		defense += 15;
	}

	public void showInfo() {
		System.out.println("----------------------------------------------------------------------");
		System.out.print("이름 : " + name);
		System.out.print("   체력 : " + healthPoint);
		System.out.print("   공격력 : " + attackDamage);
		System.out.println("   방어력 : " + defense);
	}

}
