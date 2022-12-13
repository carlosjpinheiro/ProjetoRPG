import java.util.Scanner;

public class Turn {

	static Scanner scan = new Scanner(System.in);
	private static String op;
	
	public static void turnHuman(personagem atacante, Enemies defensor) {
		 System.out.println("Digite:\n1-Ataque normal\n2-Ataque Especial 1 (usa MP)\n3-Ataque Especial 1 (usa MP)");
			op = scan.next();
			switch (op) {
			case "1":
				defensor.diminuiHP(atacante.calculaDano(1));
				System.out.println("Você ataca "+defensor.getnome()+" e o deixa com "+defensor.getHP()+" de HP");
				break;
			case "2":
				defensor.diminuiHP(atacante.calculaDano(2));
				System.out.println("Você ataca "+defensor.getnome()+" com "+atacante.getNomeHabilidade1()+" e o deixa com "+defensor.getHP()+" de HP");
				break;
			case "3":
				defensor.diminuiHP(atacante.calculaDano(3));
				System.out.println("Você ataca "+defensor.getnome()+" com "+atacante.getNomeHabilidade2()+" e o deixa com "+defensor.getHP()+" de HP");
				break;

			default:
				break;
			}
	}
	
	public static void turnBot(Enemies atacante, personagem defensor) {
		//implementar logica pra dar ataca especial ou simples
		
		
		//		defensor.diminuiHP(atacante.calculaDano());
		System.out.println(atacante.getnome()+" lhe ataca, o deixando com "+defensor.getHP()+" de HP");
	}
	
}
