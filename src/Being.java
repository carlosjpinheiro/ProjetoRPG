
public abstract class Being {
	
	public String name;
	public int hp,mp,hpMax,mpMax,level,exp,mpPotions,hpPotions,gold, def, damage;
	public long requiredXp = 1000;
	
	
	public abstract void attack(Being vitima);
	
	public abstract void attackUlt(Being vitima) ;
	
	public abstract void attackEffect(Being vitima) ;
	
	public void levelUp() {
		this.setRequiredXp(this.getRequiredXp() + (int)(this.getRequiredXp() * 0.2));
		this.setLevel(this.getLevel()+1);
		this.setHpMax(this.getHpMax() + (int)(this.getHpMax()*0.1)); 
		this.setHp(this.getHp() + (int)(this.getHpMax()*0.1));
		this.setMpMax(this.getMpMax() + (int)(this.getMpMax()*0.08));
		this.setMp(this.getMp() + (int)(this.getMpMax()*0.08));
		this.setExp(0);
		
		
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
		if ((this.hp > this.hpMax) && (this.hpMax != 0)) {
			this.hp = this.hpMax;
		}
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
		if ((this.mp > this.mpMax) && (this.mpMax != 0)) {
			this.mp = this.mpMax;
		}
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHpMax() {
		return hpMax;
	}

	public void setHpMax(int hpMax) {
		this.hpMax = hpMax;
	}

	public int getMpMax() {
		return mpMax;
	}

	public void setMpMax(int mpMax) {
		this.mpMax = mpMax;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getMpPotions() {
		return mpPotions;
	}

	public void setMpPotions(int mpPotions) {
		this.mpPotions = mpPotions;
	}

	public int getHpPotions() {
		return hpPotions;
	}

	public void setHpPotions(int hpPotions) {
		this.hpPotions = hpPotions;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public long getRequiredXp() {
		return requiredXp;
	}

	public void setRequiredXp(long requiredXp) {
		this.requiredXp = requiredXp;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	
	
	
}
