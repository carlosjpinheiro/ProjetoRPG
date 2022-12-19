
public class Enemy4 extends Enemies{
	
	public Enemy4(){
		super();
		this.setHP(50);
		this.setNivel(1);
		this.setMP(10); 
		this.setnome("Urso");
		this.setAtaque(12);
		this.setDefesa(6);
		this.setNomeHabilidade1("Mordida profunda");
        this.setimagem("/img/inimigo/ursorpg.jpg");
	}
	
	public Enemy4(int nivel) {
		super();
		double fatorCrescimento = nivel * 10;
		this.setHP(50+(int)Math.round((40 * fatorCrescimento))/100);
		this.setNivel(nivel);
		this.setAtaque(12+(int)Math.round((12*fatorCrescimento))/100);
		this.setDefesa(6+(int)Math.round((6*fatorCrescimento))/100);
		this.setnome("Urso");
		this.setNomeHabilidade1("Mordida profunda");
		this.setimagem("/img/inimigo/ursorpg.jpg");
		
	}
	
}