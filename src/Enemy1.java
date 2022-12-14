
public class Enemy1 extends Enemies{

	public Enemy1(){
		super();
		this.setHP(50);
		this.setNivel(1);
		this.setMP(10); 
		this.setnome("Bandido");
		this.setAtaque(10);
		this.setDefesa(3);
		this.setNomeHabilidade1("Roubo de vida");
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