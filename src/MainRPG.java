import java.util.Scanner;

public class MainRPG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		SelecaoPersonagem tela = new SelecaoPersonagem();
		tela.setVisible(true);
		
		arqueiro heroi = new arqueiro("moserzz");
	
		while (heroi.getHP() > 0) {
		if (Encounter.counter > 1) Potions.perguntaUsarHP(heroi);			
			System.out.println("Você encontra o inimigo nr " + Encounter.counter);
			Encounter.encounter(heroi);
			if (Utilities.chance(10)) {
				heroi.setHpPocoes(heroi.getHpPocoes()+1);
				System.out.println("Uma poção de HP cai de seu inimigo e você a recolhe!");
			}
		}
		
		
	}
}
