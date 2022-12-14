
public class Encounter {

	public static int counter = 1;
	public static int count = 1;
	private static int rando;
	private static Enemies inimigo;
	private static Bosses boss;
	
	public static void encounter(Personagem p) {
		
		if (counter > 0 && counter % 5 == 0) {
			switch (count) {
			case 1:
				boss = new Boss1();
				count++;
				break;
			
			case 2:
				boss = new Boss2();
				count++;
				break;
				
			case 3:
				boss = new Boss3();
				count = 1;
				break;
			}
			
			//System.out.println("Você encontrou o chefão " + boss.getnome() + "!");
			Jogo.imprimeMensagem("Você encontrou o chefão " + boss.getnome() + "!");
			while (p.getHP() > 0 && boss.getHP() > 0) {
				Round.round(p, boss);
			}
				
			} else {
				rando = (int)(Math.random()*100);
				if(rando < 25) {
					inimigo = new Enemy1(p.getNivel());
				} else if (rando < 50) {
					inimigo = new Enemy2(p.getNivel());
				} else if (rando < 75) {
					inimigo = new Enemy3(p.getNivel());
				} else {
					inimigo = new Enemy4(p.getNivel());
				}
				//System.out.println("Voce encontrou um "+inimigo.getnome()+"!");
				Jogo.imprimeMensagem("Voce encontrou um "+inimigo.getnome()+"!");
				while (p.getHP() > 0 && inimigo.getHP() > 0) {
					Round.round(p, inimigo);
				}			
			}
		
		counter ++;
	}
	
}
