import java.util.Scanner;

public class MainRPG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		Menu menu = new Menu();
		Player player = new Player();
		System.out.print("Nome do jogador: ");
		String name = scan.next();
		player.setName(name);
		
		try {
			menu.history(player.getName());
			menu.menu();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
}
