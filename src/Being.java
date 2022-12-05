
public abstract class Being {
	
	private int hp,mp,level;
	private String name;
		
	public abstract void attack(Being vitima);
	
	public abstract void attackUlt(Being vitima) ;
	
	public abstract void attackEffect(Being vitima) ;
	
	public void levelUp() {
		
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
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
	
	
	
	
}
