import javax.swing.JOptionPane;

public class GameObjects {
	static Being  inimigo = new Enemy5();
	public static void finalizaJogo() {
		//System.exit(0);
		JOptionPane.showMessageDialog(null, "Você morreu!");
	}

}