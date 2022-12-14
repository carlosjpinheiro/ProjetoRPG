import java.util.Scanner;

public class MainRPG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner scan = new Scanner(System.in);
//		SelecaoPersonagem tela = new SelecaoPersonagem();
//		tela.setVisible(true);
		
		Jogo j = new Jogo();
		Personagem p = new Arqueiro("Zézinho");
		
		
		j.rodaEncontros(p);
		
		
		
	}
}
