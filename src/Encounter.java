
public class Encounter {

	public static int counter = 0;
	private static int rando;
	private static Being inimigo;
	
	public static void encounter(Being heroi) {
		rando = (int)(Math.random()*100);
		if(rando < 25) {
			inimigo = new Enemy1();
		} else if (rando < 50) {
			inimigo = new Enemy2();
		} else if (rando < 75) {
			inimigo = new Enemy3();
		} else {
			inimigo = new Enemy4();
		}
		System.out.println("Voce encontrou um "+inimigo.getName()+"!");
		while (heroi.getHp() > 0 && inimigo.getHp() > 0) {
			Round.round(heroi, inimigo);
		}
		counter ++;
	}
	
}
