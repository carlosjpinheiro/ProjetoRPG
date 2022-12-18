
public class Encounter {

	public static int counter = 1;
	public static int count = 1;
	private static int rando;

	public static void encounter(Personagem p) {
		if (ObjetosJogo.inimigo != null) {
			if (ObjetosJogo.inimigo.HP <= 0) {
				ObjetosJogo.inimigo = null;
				counter++;
			}
		}
		if (ObjetosJogo.inimigo == null) {
			if (counter > 0 && counter % 5 == 0) {
				switch (count) {
				case 1:
					ObjetosJogo.inimigo = new Boss1();
					Jogo.imprimeMensagem("Você encontrou o chefão " + ObjetosJogo.inimigo.getnome() + "!");
					count++;
					break;

				case 2:
					ObjetosJogo.inimigo = new Boss2();
					Jogo.imprimeMensagem("Você encontrou o chefão " + ObjetosJogo.inimigo.getnome() + "!");
					count++;
					break;

				case 3:
					ObjetosJogo.inimigo = new Boss3();
					Jogo.imprimeMensagem("Você encontrou o chefão " + ObjetosJogo.inimigo.getnome() + "!");
					count = 1;
					break;
				}

			} else {
				rando = (int) (Math.random() * 100);
				if (rando < 25) {
					ObjetosJogo.inimigo = new Enemy1(p.getNivel());
					Jogo.imprimeMensagem("Voce encontrou um " + ObjetosJogo.inimigo.getnome() + "!");
				} else if (rando < 50) {
					ObjetosJogo.inimigo = new Enemy2(p.getNivel());
					Jogo.imprimeMensagem("Voce encontrou um " + ObjetosJogo.inimigo.getnome() + "!");
				} else if (rando < 75) {
					ObjetosJogo.inimigo = new Enemy3(p.getNivel());
					Jogo.imprimeMensagem("Voce encontrou um " + ObjetosJogo.inimigo.getnome() + "!");
				} else {
					ObjetosJogo.inimigo = new Enemy4(p.getNivel());
					Jogo.imprimeMensagem("Voce encontrou um " + ObjetosJogo.inimigo.getnome() + "!");
				}

			}
		}
		Round.round(p, ObjetosJogo.inimigo);
	}

}
