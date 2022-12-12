
public class Enemy1 extends Enemies{

	public Enemy1() {
		super();
		this.setHp(50);
		this.setMp(30); 
		this.setLevel(1);
		this.setDef(15);
		this.setDamage(25);
		this.setName("Bandido");
	}

	public Enemy1(int nivel) {
		super();
		double fatorCrescimento = nivel * 10;
		this.setHp(50+(int)Math.round((50 * fatorCrescimento))/100);
		this.setMp(30+(int)Math.round((30*fatorCrescimento))/100); 
		this.setLevel(nivel);
		this.setDef(15+(int)Math.round((15*fatorCrescimento))/100);
		this.setDamage(25+(int)Math.round((25*fatorCrescimento))/100);
		this.setName("Bandido");
	}
	
}
