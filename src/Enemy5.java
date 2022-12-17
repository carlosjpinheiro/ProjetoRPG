
public class Enemy5 extends Enemies{
	
	public Enemy5(){
		super();
		this.setHP(50);
		this.setNivel(1);
		this.setMP(10); 
		this.setnome("Zumbi");
		this.setAtaque(9);
		this.setDefesa(2);
		this.setNomeHabilidade1("Mordida venenosa");
        this.setimagem("/img/inimigo/zumbi.jpg");
	}

	public Enemy5(int nivel) {
		super();
		double fatorCrescimento = nivel * 10;
		this.setHP(50+(int)Math.round((40 * fatorCrescimento))/100);
		this.setNivel(nivel);
		this.setAtaque(9+(int)Math.round((9*fatorCrescimento))/100);
		this.setDefesa(2+(int)Math.round((2*fatorCrescimento))/100);
		this.setnome("Zumbi");
		this.setNomeHabilidade1("Mordida venenosa");
		 this.setimagem("/img/inimigo/zumbi.jpg");
	}
	
}