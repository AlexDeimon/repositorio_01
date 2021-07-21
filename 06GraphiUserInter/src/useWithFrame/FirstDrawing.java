package useWithFrame;
import java.awt.Graphics;

import javax.swing.JFrame;

public class FirstDrawing extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	FirstDrawing(){}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstDrawing myFirstDrawing=new FirstDrawing();
		myFirstDrawing.setSize(600, 300);
		myFirstDrawing.setVisible(true);
	}
	public void paint(Graphics g) {
		g.drawOval(100, 100, 40, 20);
	}
}