
public abstract class Being {
	
	public int HP,MP,Nivel;
	public String nome;
	private String nomeHabilidade1;
		
	public abstract void diminuiHP(int dano);
	
	public abstract int calculaDano(int habilidade);
	
	public String imagem;
	
	public String getimagem() {
		return imagem;
	}

	public void setimagem(String imagem) {
		this.imagem = imagem;
	}
	

	public String getNomeHabilidade1() {
		return nomeHabilidade1;
	}

	public void setNomeHabilidade1(String nomeHabilidade1) {
		this.nomeHabilidade1 = nomeHabilidade1;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int HP) {
		this.HP = HP;
	}

	public int getMP() {
		return MP;
	}

	public void setMP(int MP) {
		this.MP = MP;
	}

	public int getNivel() {
		return Nivel;
	}

	public void setNivel(int Nivel) {
		this.Nivel = Nivel;
	}

	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}
	
}
