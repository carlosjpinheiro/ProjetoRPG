
public class Enemies extends Being{

	@Override
	public void attack(Being vitima) {
		vitima.setHp(vitima.getHp() - this.getLevel());
	}
	
	@Override
	public void attackUlt(Being vitima) {
		return;
	}
	
	@Override
	public void attackEffect(Being vitima) {
		return;
	}
	
	
	
	
}
