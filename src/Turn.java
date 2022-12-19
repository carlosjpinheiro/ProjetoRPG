import java.util.Scanner;

public class Turn {

	static Scanner scan = new Scanner(System.in);
	private static String op;
	
	public static void turnBot(Being atacante, Character defensor) {
		if (Utilities.chance(20)) {			//20% de chance do inimigo dar o ataque especial e 80% de atck normal
			defensor.diminuiHP(atacante.calculaDano(2));
			if (defensor.getHP() <= 0) {
				//System.out.println(atacante.getnome()+" lhe ataca, o deixando com 0 HP");
				Game.imprimeMensagem(atacante.getnome()+" lhe ataca, o deixando com 0 HP");
				Game.imprimeMensagem("Você morreu!");
				GameObjects.finalizaJogo();
			} else {
				//System.out.println(atacante.getnome()+" lhe ataca com "+atacante.getNomeHabilidade1()+" o deixando com "+defensor.getHP()+" de HP");				
				Game.imprimeMensagem(atacante.getnome()+" lhe ataca com "+atacante.getNomeHabilidade1()+" o deixando com "+defensor.getHP()+" de HP");
			}
		} else {
			defensor.diminuiHP(atacante.calculaDano(1));
			if (defensor.getHP() <= 0) {
				//System.out.println(atacante.getnome()+" lhe ataca, o deixando com 0 HP");
				Game.imprimeMensagem(atacante.getnome()+" lhe ataca, o deixando com 0 HP");
				Game.imprimeMensagem("Você morreu!");
				GameObjects.finalizaJogo();
			} else {
				//System.out.println(atacante.getnome()+" lhe ataca, o deixando com "+defensor.getHP()+" de HP");		
				Game.imprimeMensagem(atacante.getnome()+" lhe ataca, o deixando com "+defensor.getHP()+" de HP");
			}
		}
		
	}
	
	
	public static void turnBoss(Being atacante, Character defensor) {
		if (Utilities.chance(10)) {							//define o tipo de ataque do boss conforme porcentagens
			defensor.diminuiHP(atacante.calculaDano(3));
			if (defensor.getHP() <= 0) {
				//System.out.println(atacante.getnome()+" lhe ataca, o deixando com 0 HP");
				Game.imprimeMensagem(atacante.getnome()+" lhe ataca, o deixando com 0 HP");
			} else {
				//System.out.println(atacante.getnome()+" lhe ataca com "+atacante.getNomeHabilidade2()+" o deixando com "+defensor.getHP()+" de HP");				
				Game.imprimeMensagem(atacante.getnome()+" lhe ataca com "+atacante.getNomeHabilidade2()+" o deixando com "+defensor.getHP()+" de HP");
			}
		} else if (Utilities.chance(20)){
			defensor.diminuiHP(atacante.calculaDano(2));
			if (defensor.getHP() <= 0) {
				//System.out.println(atacante.getnome()+" lhe ataca, o deixando com 0 HP");
				Game.imprimeMensagem(atacante.getnome()+" lhe ataca, o deixando com 0 HP");
			} else {
				//System.out.println(atacante.getnome()+" lhe ataca com "+atacante.getNomeHabilidade1()+" o deixando com "+defensor.getHP()+" de HP");				
				Game.imprimeMensagem(atacante.getnome()+" lhe ataca com "+atacante.getNomeHabilidade1()+" o deixando com "+defensor.getHP()+" de HP");
			}
		} else {
			defensor.diminuiHP(atacante.calculaDano(1));
			if (defensor.getHP() <= 0) {
				//System.out.println(atacante.getnome()+" lhe ataca, o deixando com 0 HP");
				Game.imprimeMensagem(atacante.getnome()+" lhe ataca, o deixando com 0 HP");
			} else {
				//System.out.println(atacante.getnome()+" lhe ataca, o deixando com "+defensor.getHP()+" de HP");
				Game.imprimeMensagem(atacante.getnome()+" lhe ataca, o deixando com "+defensor.getHP()+" de HP");
			}
		}
		
	}
	
	
}
