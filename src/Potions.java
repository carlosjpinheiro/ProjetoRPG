import java.util.Scanner;

public class Potions {

	static Scanner scan = new Scanner(System.in);
	static String op;
	
	public static void perguntaUsarHP(Being ser) {
		System.out.println("Deseja usar poção de HP?\n1-Sim\n2-Não");
		op = scan.next();
		switch (op) {
		case "1":
			if (ser.getHpPotions() > 0) {
				ser.setHp(ser.getHp() + ((int)(ser.getHpMax()*0.6)));
				if (ser.getHp() > ser.getHpMax()) ser.setHp(ser.getHpMax());	//nao deixa passar do hp maximo
				ser.setHpPotions(ser.getHpPotions()-1);
				System.out.println("Após tomar a poção seu HP é de: "+ser.getHp());
				if (ser.getHpPotions() == 1) {
					System.out.println("Lhe resta "+ser.getHpPotions()+" poção de HP");	
				} else {
					System.out.println("Lhe restam "+ser.getHpPotions()+" poções de HP");
				}
			} else {
				System.out.println("Você não possui poções de HP disponíveis!");
			}
			break;
		default:
			break;
		}
	}
	
	public static void perguntaUsarMP(Being ser) {
		System.out.println("Deseja usar poção de MP?\n1-Sim\n2-Não");
		op = scan.next();
		switch (op) {
		case "1":
			if (ser.getMpPotions() > 0) {
				ser.setMp(ser.getMp() + ((int)(ser.getMpMax()*0.6)));
				if (ser.getMp() > ser.getMpMax()) ser.setMp(ser.getMpMax());	//nao deixa passar do Mp maximo
				ser.setMpPotions(ser.getMpPotions()-1);
				System.out.println("Após tomar a poção seu MP é de: "+ser.getMp());
				if (ser.getMpPotions() == 1) {
					System.out.println("Lhe resta "+ser.getMpPotions()+" poção de MP");	
				} else {
					System.out.println("Lhe restam "+ser.getMpPotions()+" poções de MP");
				}
			} else {
				System.out.println("Você não possui poções de MP disponíveis!");
			}
			break;
		default:
			break;
		}
	}
	
	
}
