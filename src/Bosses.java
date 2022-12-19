public class Bosses extends Being{

    private int Ataque;
    private int Defesa;
    private double taxaDanoHabilidade1;
    private double taxaDanoHabilidade2;
    private String nomeHabilidade1;
    private String nomeHabilidade2;
    public boolean isBoss = true;

	public void diminuiHP(int dano){
            int danoFinal = (dano - Defesa);
            if (danoFinal > 0){
               HP -= danoFinal;
            }
        }

     public int calculaDano(int habilidade) {
            switch (habilidade) {
                case 1:
                    return (int) this.Ataque;
                case 2:
                    return (int) (Ataque * taxaDanoHabilidade1);
                case 3:
                     return (int) (Ataque * taxaDanoHabilidade2);
                default:
                    return 0;
            }
        }
     
     
     
    public double getTaxaDanoHabilidade1() {
        return taxaDanoHabilidade1;
    }



    public void setTaxaDanoHabilidade1(double taxaDanoHabilidade1) {
        this.taxaDanoHabilidade1 = taxaDanoHabilidade1;
    }



    public double getTaxaDanoHabilidade2() {
        return taxaDanoHabilidade2;
    }



    public void setTaxaDanoHabilidade2(double taxaDanoHabilidade2) {
        this.taxaDanoHabilidade2 = taxaDanoHabilidade2;
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

    public String getNomeHabilidade1() {
        return nomeHabilidade1;
    }

    public void setNomeHabilidade1(String nomeHabilidade1) {
        this.nomeHabilidade1 = nomeHabilidade1;
    }

    public String getNomeHabilidade2() {
        return nomeHabilidade2;
    }

    public void setNomeHabilidade2(String nomeHabilidade2) {
        this.nomeHabilidade2 = nomeHabilidade2;
    }

    public boolean isBoss() {
 		return isBoss;
 	}

 	public void setBoss(boolean isBoss) {
 		this.isBoss = isBoss;
 	}    
 	
 	
    
}