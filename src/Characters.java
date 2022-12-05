
public class Characters extends Being{

	public int exp, hpPotion;
	
	@Override
	public void attack(Being vitima) {
		if (Utilities.chance(10)) {
			vitima.setHp(vitima.getHp() - (this.getLevel()+1));
			System.out.println("Acerto crítico!!");
		}
		else vitima.setHp(vitima.getHp() - this.getLevel());
		
	}
	
	@Override
	public void attackUlt(Being vitima) {
		
	}
	
	@Override
	public void attackEffect(Being vitima) {
		
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getHpPotion() {
		return hpPotion;
	}

	public void setHpPotion(int hpPotion) {
		this.hpPotion = hpPotion;
	}
	
	
}
