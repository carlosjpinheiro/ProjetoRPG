
public class Enemies extends Being{

    private int Ataque;
    private int Defesa;
    private String nomeHabilidade1;
    
    public void diminuiHPinimigo(int dano){		//quando recebe ataque
        int danoFinal = (dano - Defesa);
        if (danoFinal > 0){
           HP -= danoFinal;
        }
    }
 
    public int ataqueSimples() {		//para causar dano
    	return Ataque;
    }
    
    
    
    
	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int getAtaque() {
		return Ataque;
	}

	public void setAtaque(int ataque) {
		Ataque = ataque;
	}

	public int getDefesa() {
		return Defesa;
	}

	public void setDefesa(int defesa) {
		Defesa = defesa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeHabilidade1() {
		return nomeHabilidade1;
	}

	public void setNomeHabilidade1(String nomeHabilidade1) {
		this.nomeHabilidade1 = nomeHabilidade1;
	}
    
    
    
}
