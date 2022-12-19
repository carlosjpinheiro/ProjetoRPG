
public class Round {

	public static void round(Personagem heroi, Being inimigo) {
		
		//Turn.turnHuman(heroi, inimigo);
		if (inimigo.getHP() <= 0) {
			//System.out.println("Você matou "+inimigo.getnome()+"!!");
			//System.out.println("-------------------");
			Jogo.imprimeMensagem("Você matou "+inimigo.getnome()+"!!");
		} else {
			if(inimigo.isBoss()) {
				Turn.turnBoss(inimigo, heroi);
			} else {
				Turn.turnBot(inimigo, heroi);				
			}
		}
	}
	

	
}
