
public class Enemies extends Being{

	  
	    private int ataque;
	    private int defesa;
	    
	    
	    
	    
	    public void diminuiHP(int dano){
	        int danoFinal = (dano - defesa);
	        if (danoFinal > 0){
	           HP -= danoFinal;
	        }
	    }
	    
	    public int calculaDano(int ataque) {
	        switch (ataque) {
	            case 1:
	                return (int) this.ataque;
	            case 2:
	               return (int) (ataque*140/100);
	            default:
	                return 0;
	        }
	    }
	    

		public Enemies() {
			// TODO Auto-generated constructor stub
		}

	
		
		public int calculaDano() {
			return ataque;
		}
	    
	   

		public int getAtaque() {
			return ataque;
		}

		public void setAtaque(int ataque) {
			this.ataque = ataque;
		}

		public int getDefesa() {
			return defesa;
		}

		public void setDefesa(int defesa) {
			this.defesa = defesa;
		}

	    
}