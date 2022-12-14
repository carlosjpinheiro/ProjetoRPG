
public class Round {

	public static void round(Personagem heroi, Enemies inimigo) {
		
		Turn.turnHuman(heroi, inimigo);
		if (inimigo.getHP() <= 0) {
			System.out.println("Você matou "+inimigo.getnome()+"!!");
		} else Turn.turnBot(inimigo, heroi);
	}
	
	public static void round(personagem heroi, Bosses inimigo) {
		
		Turn.turnHuman(heroi, inimigo);
		if (inimigo.getHP() <= 0) {
			System.out.println("Você matou "+inimigo.getnome()+"!!");
		} else Turn.turnBot(inimigo, heroi);
	}
	
}
