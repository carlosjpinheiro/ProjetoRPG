
public class Enemy2 extends Enemies{

	public Enemy2(){
		super();
		this.setHP(50);
		this.setNivel(1);
		this.setMP(10); 
		this.setnome("Goblin");
		this.setAtaque(15);
		this.setDefesa(6);
		this.setNomeHabilidade1("Arremeço ao ar");
        this.setimagem("/img/inimigo/Goblin.jpg");
	}
	
	public Enemy2(int nivel) {
		super();
		double fatorCrescimento = nivel * 10;
		this.setHP(50+(int)Math.round((50 * fatorCrescimento))/100);
		this.setNivel(nivel);
		this.setAtaque(15+(int)Math.round((15*fatorCrescimento))/100);
		this.setDefesa(6+(int)Math.round((6*fatorCrescimento))/100);
		this.setnome("Goblin");
		this.setNomeHabilidade1("Arremeço ao ar");
		this.setimagem("/img/inimigo/Goblin.jpg");
		  
	}
}

