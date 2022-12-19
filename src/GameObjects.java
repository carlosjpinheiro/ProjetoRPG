import javax.swing.JOptionPane;

public class GameObjects {
	static Being  inimigo = new Enemy5();
	public static void finalizaJogo() {
		JOptionPane.showMessageDialog(null, "Você morreu!");
		System.exit(0);
	}

}
