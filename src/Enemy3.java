
public class Enemy3 extends Enemies{

	public Enemy3(){
		super();
		this.setHP(40);
		this.setNivel(1);
		this.setMP(10); 
		this.setnome("ORC");
		this.setAtaque(8);
		this.setDefesa(5);
		this.setNomeHabilidade1("Corte profundo");

	}
	
	public Enemy3(int nivel) {
		super();
		double fatorCrescimento = nivel * 10;
		this.setHP(40+(int)Math.round((40 * fatorCrescimento))/100);
		this.setNivel(nivel);
		this.setAtaque(8+(int)Math.round((8*fatorCrescimento))/100);
		this.setDefesa(5+(int)Math.round((5*fatorCrescimento))/100);
		this.setnome("ORC");
		this.setNomeHabilidade1("Corte profundo");
	}
}
