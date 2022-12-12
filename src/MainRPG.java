
public class MainRPG {

	public static void main(String[] args) {
		
		Being heroi = new Character1();
				
		heroi.levelUp();
		heroi.levelUp();
		heroi.levelUp();
		heroi.levelUp();
		heroi.levelUp();
		
		Being inimigo = new Enemy1(heroi.getLevel());
		
		System.out.println(inimigo.getDamage());
		System.out.println(inimigo.getDef());
		System.out.println(inimigo.getHp());
		System.out.println(inimigo.getMp());
		System.out.println(inimigo.getName());
		
//		System.out.println(heroi.getLevel());
		
//		while (heroi.getHp() > 0) {
//			if (Encounter.counter > 1) Potions.perguntaUsarHP(heroi);			
//			System.out.println("Você encontra o inimigo nr "+Encounter.counter);
//			Encounter.encounter(heroi);
//			if (Utilities.chance(10)) {
//				heroi.setHpPotions(heroi.getHpPotions()+1);
//				System.out.println("Uma poção de HP cai de seu inimigo e você a recolhe!");
//			}
//		}
//		
		
		
	}

}
