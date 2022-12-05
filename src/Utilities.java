public class Utilities {

	public static boolean chance(int prob) {
		if((int)(Math.random()*100) <= prob) return true;
		return false;
	}
}
