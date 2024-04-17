package basic.ch07;

public class SpellMainTest {
	
	public static void main(String[] args) {
		Spell spell1 = new Spell();
		spell1.manaCost = 75;
		spell1.spellDamage = 255;
		spell1.speellHotKey = "E";
		spell1.spellName = "양날 독(Two-Shiv Poison)";
		
		spell1.showSpellInfo();
		spell1.useSpell();
		
	}

}
