import java.util.Scanner;

public class Turn {

	static Scanner scan = new Scanner(System.in);
	private static String op;
	
	public static void turnHuman(Being atacante, Being defensor) {
		 System.out.println("Digite:\n1-Ataque normal\n2-Ataque Especial (usa MP)\n3-Ataque de efeito (usa MP)");
			op = scan.next();
			switch (op) {
			case "1":
				atacante.attack(defensor);
				System.out.println("Você ataca "+defensor.getName()+" e o deixa com "+defensor.getHp()+" de HP");
				break;
//			case "2":
//				
//				break;
//			case "3":
	//	
//				break;

			default:
				break;
			}
	}
	
	public static void turnBot(Being atacante, Being defensor) {
		atacante.attack(defensor);
		System.out.println(atacante.getName()+" lhe ataca, o deixando com "+defensor.getHp()+" de HP");
	}
	
}
