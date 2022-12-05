
public class Round {

	public static void round(Being heroi, Being inimigo) {
		
		Turn.turnHuman(heroi, inimigo);
		if (inimigo.getHp() <= 0) {
			System.out.println("Você matou "+inimigo.getName()+"!!");
		} else Turn.turnBot(inimigo, heroi);
	}
	
}
