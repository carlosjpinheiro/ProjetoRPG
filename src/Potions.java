import java.util.Scanner;

public class Potions {

	static Scanner scan = new Scanner(System.in);
	static String op;
	
	public static void perguntaUsarHP(Personagem p) {
		System.out.println("Deseja usar poção de HP?\n1-Sim\n2-Não");		//essa versao que pergunta no console deve ser transformada em botoes
		op = scan.next();
		switch (op) {
		case "1":
			if (p.getHpPocoes() > 0) {
				p.setHP(p.getHP() + ((int)(p.getHPMaximo()*0.6)));
				
				p.setHpPocoes(p.getHpPocoes()-1);
				//System.out.println("Após tomar a poção seu HP é de: "+p.getHP());
				Jogo.imprimeMensagem("Após tomar a poção seu HP é de: "+p.getHP());
				if (p.getHpPocoes() == 1) {
					//System.out.println("Lhe resta 1 poção de HP");	
					Jogo.imprimeMensagem("Lhe resta 1 poção de HP");
				} else {
					//System.out.println("Lhe restam "+p.getHpPocoes()+" poções de HP");
					Jogo.imprimeMensagem("Lhe restam "+p.getHpPocoes()+" poções de HP");
				}
			} else {
				//System.out.println("Você não possui poções de HP disponíveis!");
				Jogo.imprimeMensagem("Você não possui poções de HP disponíveis!");
			}
			break;
		default:
			break;
		}
	}
	
	public static void perguntaUsarMP(Personagem p) {
		System.out.println("Deseja usar poção de MP?\n1-Sim\n2-Não");
		op = scan.next();
		switch (op) {
		case "1":
			if (p.getMpPocoes() > 0) {
				p.setMP(p.getMP() + ((int)(p.getMPMaximo()*0.6)));
				
				p.setMpPocoes(p.getMpPocoes()-1);
				//System.out.println("Após tomar a poção seu MP é de: "+p.getMP());
				Jogo.imprimeMensagem("Após tomar a poção seu MP é de: "+p.getMP());
				if (p.getMpPocoes() == 1) {
					//System.out.println("Lhe resta "+p.getMpPocoes()+" poção de MP");
					Jogo.imprimeMensagem("Lhe resta 1 poção de MP");
				} else {
					//System.out.println("Lhe restam "+p.getMpPocoes()+" poções de MP");
					Jogo.imprimeMensagem("Lhe restam "+p.getMpPocoes()+" poções de MP");
				}
			} else {
				//System.out.println("Você não possui poções de MP disponíveis!");
				Jogo.imprimeMensagem("Você não possui poções de MP disponíveis!");
			}
			break;
		default:
			break;
		}
	}
	
}
