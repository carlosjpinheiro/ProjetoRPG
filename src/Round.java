
public class Round {

	public static void round(Character heroi, Being inimigo) {
		
		if (inimigo.getHP() <= 0) {
			//System.out.println("Você matou "+inimigo.getnome()+"!!");
			//System.out.println("-------------------");
			Game.imprimeMensagem("Você matou "+inimigo.getnome()+"!!");
		} else {
			if(inimigo.isBoss()) {
				Turn.turnBoss(inimigo, heroi);
			} else {
				Turn.turnBot(inimigo, heroi);				
			}
		}
	}
	

	
}
