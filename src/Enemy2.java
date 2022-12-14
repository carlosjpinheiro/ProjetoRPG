
public class Enemy2 extends Enemies{

	public Enemy2(){
		super();
		this.setHP(50);
		this.setNivel(1);
		this.setMP(10); 
		this.setnome("Goblin");
		this.setAtaque(6);
		this.setDefesa(6);
		this.setNomeHabilidade1("Arremeço ao ar");
	}
	
	public Enemy2(int nivel) {
		super();
		double fatorCrescimento = nivel * 10;
		this.setHP(50+(int)Math.round((50 * fatorCrescimento))/100);
		this.setNivel(nivel);
		this.setAtaque(6+(int)Math.round((6*fatorCrescimento))/100);
		this.setDefesa(6+(int)Math.round((6*fatorCrescimento))/100);
		this.setnome("Goblin");
		this.setNomeHabilidade1("Arremeço ao ar");
	}
}

