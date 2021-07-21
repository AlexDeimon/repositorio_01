package useWithFrame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;

public class DrawPolygons extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	DrawPolygons(){}
	public static void main(String[] args) {
		DrawPolygons myDrawPolygons=new DrawPolygons();
		myDrawPolygons.setSize(500,500);
		myDrawPolygons.setVisible(true);
	}
	public void paint(Graphics g) {
		Polygon myPolygon=new Polygon();
		myPolygon.addPoint(10,60);
		myPolygon.addPoint(200, 200);
		myPolygon.addPoint(10, 200);
		g.drawPolygon(myPolygon);
		g.setColor(Color.red);
		g.fillPolygon(myPolygon);
	}
}
