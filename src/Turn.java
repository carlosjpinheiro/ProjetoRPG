import java.util.Scanner;

public class Turn {

	static Scanner scan = new Scanner(System.in);
	private static String op;
	
	public static void turnHuman(Personagem atacante, Enemies defensor) {
		 System.out.println("Digite:\n1-Ataque normal\n2-Ataque Especial 1 (usa MP)\n3-Ataque Especial 2 (usa MP)");
			op = scan.next();
			switch (op) {
			case "1":
				defensor.diminuiHP(atacante.calculaDano(1));
				if (defensor.getHP() <= 0) {
					System.out.println("Você ataca "+defensor.getnome()+" e o deixa com 0 de HP");
					break;
				} else {
					System.out.println("Você ataca "+defensor.getnome()+" e o deixa com "+defensor.getHP()+" de HP");
					break;
				}
			case "2":
				defensor.diminuiHP(atacante.calculaDano(2));
				if (defensor.getHP() <= 0) {
					System.out.println("Você ataca "+defensor.getnome()+" e o deixa com 0 de HP");
					break;
				} else {
					System.out.println("Você ataca "+defensor.getnome()+" com "+atacante.getNomeHabilidade1()+" e o deixa com "+defensor.getHP()+" de HP");
					break;					
				}
			case "3":
				defensor.diminuiHP(atacante.calculaDano(3));
				if (defensor.getHP() <= 0) {
					System.out.println("Você ataca "+defensor.getnome()+" e o deixa com 0 de HP");
					break;
				} else {
					System.out.println("Você ataca "+defensor.getnome()+" com "+atacante.getNomeHabilidade2()+" e o deixa com "+defensor.getHP()+" de HP");
					break;					
				}
			default:
				break;
			}
	}
	
	public static void turnBot(Enemies atacante, Personagem defensor) {
		if (Utilities.chance(20)) {			//20% de chance do inimigo dar o ataque especial e 80% de atck normal
			defensor.diminuiHP(atacante.calculaDano(2));
			if (defensor.getHP() <= 0) {
				System.out.println(atacante.getnome()+" lhe ataca, o deixando com 0 HP");
			} else {
				System.out.println(atacante.getnome()+" lhe ataca com "+atacante.getNomeHabilidade1()+" o deixando com "+defensor.getHP()+" de HP");				
			}
		} else {
			defensor.diminuiHP(atacante.calculaDano(1));
			if (defensor.getHP() <= 0) {
				System.out.println(atacante.getnome()+" lhe ataca, o deixando com 0 HP");
			} else {
				System.out.println(atacante.getnome()+" lhe ataca, o deixando com "+defensor.getHP()+" de HP");				
			}
		}
		
	}
	
	


	public static void turnHuman(Personagem atacante, Bosses defensor) {
		System.out.println("Digite:\n1-Ataque normal\n2-Ataque Especial 1 (usa MP)\n3-Ataque Especial 2 (usa MP)");
		op = scan.next();
		switch (op) {
		case "1":
			defensor.diminuiHP(atacante.calculaDano(1));
			if (defensor.getHP() <= 0) {
				System.out.println("Você ataca "+defensor.getnome()+" e o deixa com 0 de HP");
				break;
			} else {
				System.out.println("Você ataca "+defensor.getnome()+" e o deixa com "+defensor.getHP()+" de HP");
				break;
			}
		case "2":
			defensor.diminuiHP(atacante.calculaDano(2));
			if (defensor.getHP() <= 0) {
				System.out.println("Você ataca "+defensor.getnome()+" e o deixa com 0 de HP");
				break;
			} else {
				System.out.println("Você ataca "+defensor.getnome()+" com "+atacante.getNomeHabilidade1()+" e o deixa com "+defensor.getHP()+" de HP");
				break;					
			}
		case "3":
			defensor.diminuiHP(atacante.calculaDano(3));
			if (defensor.getHP() <= 0) {
				System.out.println("Você ataca "+defensor.getnome()+" e o deixa com 0 de HP");
				break;
			} else {
				System.out.println("Você ataca "+defensor.getnome()+" com "+atacante.getNomeHabilidade2()+" e o deixa com "+defensor.getHP()+" de HP");
				break;					
			}
		default:
			break;
		}
	}
	
	
	public static void turnBot(Bosses atacante, Personagem defensor) {
		if (Utilities.chance(10)) {							//define o tipo de ataque do boss conforme porcentagens
			defensor.diminuiHP(atacante.calculaDano(3));
			if (defensor.getHP() <= 0) {
				System.out.println(atacante.getnome()+" lhe ataca, o deixando com 0 HP");
			} else {
				System.out.println(atacante.getnome()+" lhe ataca com "+atacante.getNomeHabilidade2()+" o deixando com "+defensor.getHP()+" de HP");				
			}
		} else if (Utilities.chance(20)){
			defensor.diminuiHP(atacante.calculaDano(2));
			if (defensor.getHP() <= 0) {
				System.out.println(atacante.getnome()+" lhe ataca, o deixando com 0 HP");
			} else {
				System.out.println(atacante.getnome()+" lhe ataca com "+atacante.getNomeHabilidade1()+" o deixando com "+defensor.getHP()+" de HP");				
			}
		} else {
			defensor.diminuiHP(atacante.calculaDano(1));
			if (defensor.getHP() <= 0) {
				System.out.println(atacante.getnome()+" lhe ataca, o deixando com 0 HP");
			} else {
				System.out.println(atacante.getnome()+" lhe ataca, o deixando com "+defensor.getHP()+" de HP");				
			}
		}
		
	}
	
	
}
