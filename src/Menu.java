import java.util.Scanner;

public class Menu {
	
	Scanner scan = new Scanner(System.in);
	Player player = new Player();
	int personagem;
	
	public void menu() {
		System.out.println("==== MENU DE PERSONAGEM ====");
		System.out.println("[1] - Guerreiro\n[2] - Arqueiro\n[3] - Mago\n[4] - Assassino");
		System.out.print("Escolha seu campeão: ");
		personagem = scan.nextInt();
		
		switch (personagem) {
		case 1: 
			Being warrior = new Character1();
			Encounter.encounter(warrior);
			break;
		case 2:
			Being archer = new Character2();
			Encounter.encounter(archer);
			break;
		case 3:
			Being mage = new Character3();
			Encounter.encounter(mage);
			break;
		case 4:
			Being assassin = new Character4();
			Encounter.encounter(assassin);
			break;
		}
		
	}
	
	public void history(String pname) {
		try {
			System.out.println(pname + " acorda inconsciente no meio de uma floresta enquanto estava a procura de comida para sua vila.");
			System.out.println("Ajude-o a retornar para sua vila...");
			Thread.sleep(7000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
