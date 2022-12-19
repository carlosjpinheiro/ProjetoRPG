
public class Encounter {

	public static int counter = 1;
	public static int count = 1;
	private static int rando;

	public static void encounter(Character p) {
		if (GameObjects.inimigo != null) {
			if (GameObjects.inimigo.HP <= 0) {
				GameObjects.inimigo = null;
				if (Utilities.chance(20)) {
					if (Utilities.chance(50)) {
						p.setHpPocoes(p.getHpPocoes()+1);
						//System.out.println("Uma poção de HP cai de seu inimigo e você a recolhe!");
						Game.imprimeMensagem("Uma poção de HP cai de seu inimigo e você a recolhe!");
					} else {
						p.setMpPocoes(p.getMpPocoes() + 1);
						//System.out.println("Uma poção de MP cai de seu inimigo e você a recolhe!");
						Game.imprimeMensagem("Uma poção de MP cai de seu inimigo e você a recolhe!");
					}
				}
				counter++;
			}
		}
		if (GameObjects.inimigo == null) {
			if (counter > 0 && counter % 5 == 0) {
				switch (count) {
				case 1:
					GameObjects.inimigo = new Boss1();
					Game.imprimeMensagem("Você encontrou o chefão " + GameObjects.inimigo.getnome() + "!");
					count++;
					break;

				case 2:
					GameObjects.inimigo = new Boss2();
					Game.imprimeMensagem("Você encontrou o chefão " + GameObjects.inimigo.getnome() + "!");
					count++;
					break;

				case 3:
					GameObjects.inimigo = new Boss3();
					Game.imprimeMensagem("Você encontrou o chefão " + GameObjects.inimigo.getnome() + "!");
					count = 1;
					break;
				}

			} else {
				rando = (int) (Math.random() * 100);
				if (rando < 25) {
					GameObjects.inimigo = new Enemy1(p.getNivel());
					Game.imprimeMensagem("Voce encontrou um " + GameObjects.inimigo.getnome() + "!");
				} else if (rando < 50) {
					GameObjects.inimigo = new Enemy2(p.getNivel());
					Game.imprimeMensagem("Voce encontrou um " + GameObjects.inimigo.getnome() + "!");
				} else if (rando < 75) {
					GameObjects.inimigo = new Enemy3(p.getNivel());
					Game.imprimeMensagem("Voce encontrou um " + GameObjects.inimigo.getnome() + "!");
				} else {
					GameObjects.inimigo = new Enemy4(p.getNivel());
					Game.imprimeMensagem("Voce encontrou um " + GameObjects.inimigo.getnome() + "!");
				}

			}
		}
		Round.round(p, GameObjects.inimigo);
	}

}
