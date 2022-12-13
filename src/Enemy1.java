
public class Enemy1 extends Enemies{

	public Enemy1() {
		super();
		this.setHP(50);
		this.setAtaque(20);
		this.setDefesa(5);
		this.setNomeHabilidade1("Bate carteira alucinante");
		this.setnome("Bandido");
	}
	
	public Enemy1(int nivel) {
		super();
		double fatorCrescimento = nivel * 10;
		this.setHP(50+(int)Math.round((50 * fatorCrescimento))/100);
		this.setNivel(nivel);
		this.setAtaque(20+(int)Math.round((20*fatorCrescimento))/100);
		this.setDefesa(5+(int)Math.round((5*fatorCrescimento))/100);
		this.setnome("Bandido");
	}
	
}
