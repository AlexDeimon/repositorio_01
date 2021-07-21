package useWithFrame;
public class COneFrame extends javax.swing.JFrame {
	private javax.swing.JLabel JLbl_Greetings;
	private static final long serialVersionUID = 1L;
	public COneFrame() {
		setSize(800, 300);
		setTitle("Application with frame");
		mtd_initComponents();
	}
	private void mtd_initComponents() {
		getContentPane().setLayout(null);
		JLbl_Greetings = new javax.swing.JLabel();
		JLbl_Greetings.setText("Etiqueta");
		JLbl_Greetings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		JLbl_Greetings.setFont(new java.awt.Font("Dialog",1,18));
		getContentPane().add(JLbl_Greetings);
		JLbl_Greetings.setBounds(42,36,50,30);   // (setBounds(Axe_x, Axe_y, Large, width)
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String args[]) {
		new COneFrame().setVisible(true);
	}
}
