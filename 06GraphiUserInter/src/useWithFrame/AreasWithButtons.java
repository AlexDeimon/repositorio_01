/*Diego Alejandro Sandoval Fernandez
Paula Andrea Rojas Vargas*/
package useWithFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BoxLayout;

public class AreasWithButtons extends Frame {
 	private static final long serialVersionUID = 1L;
 	char Opcion;
 	public AreasWithButtons() {
 		Panel bottomPanel = new Panel();
 		Panel centerPanel = new Panel();
 		MenuBar mb = new MenuBar();
 		Menu m = new Menu( "Menu Figuras" );
 		MenuItem Cubo = new MenuItem("Cubo");
 		m.add(Cubo);
 		MenuItem Cono = new MenuItem("Cono");
 		m.add(Cono);
 		MenuItem Ortoedro = new MenuItem("Ortoedro");
 		m.add(Ortoedro);
 		mb.add(m);
 		setMenuBar(mb);
 		
 		Button Calcular = new Button("Calcular");
 		bottomPanel.add(Calcular);
 		Label Dato = new Label("      ");
 		bottomPanel.add(Dato);
 		Label Resultado = new Label("            ");
 		bottomPanel.add(Resultado);
 		
 		Panel p_East = new Panel();
 		Panel p_Oper = new Panel();
 		Panel p_datos = new Panel();
 		
 		p_East.setLayout(new BoxLayout(p_East,BoxLayout.Y_AXIS));
 		
 		p_Oper.setLayout(new BoxLayout(p_Oper,BoxLayout.Y_AXIS));
 		Button Area = new Button("Area");
 		p_Oper.add(Area);
 		Button Volumen = new Button("Volumen");
 		p_Oper.add(Volumen);
 		
 		p_datos.setLayout(new GridLayout(4,2));
 		Label Label1 = new Label("");
    	p_datos.add("East", Label1);
    	TextField Text1 = new TextField();
    	Text1.setVisible(false);
    	p_datos.add(Text1);
    	Label Label2 = new Label("");
    	p_datos.add("East", Label2);
    	TextField Text2 = new TextField();
    	Text2.setVisible(false);
    	p_datos.add(Text2);
    	Label Label3 = new Label("");
    	p_datos.add("East", Label3);
    	TextField Text3 = new TextField();
    	Text3.setVisible(false);
    	p_datos.add(Text3);
    	
    	p_East.add(p_Oper);
    	p_East.add(new Label("BIENVENIDO ", Label.CENTER));
    	p_East.add(new Label("1. Seleccione una figura en el menu", Label.CENTER));
    	p_East.add(new Label("2. Digite los datos de la figura", Label.CENTER));
    	p_East.add(new Label("3. De click en el boton Area o el boton Volumen", Label.CENTER));
    	p_East.add(new Label("4. De click en el boton calcular", Label.CENTER));
    	p_East.add(p_datos);
    	
    	centerPanel.setLayout(new BorderLayout());
    	centerPanel.add("East",p_East);

 		CCanvas c = new CCanvas();
 		centerPanel.add( "Center",c);

 		setLayout( new BorderLayout() );
 		add( "South",bottomPanel );
 		add( "Center",centerPanel );
 		
 		Cubo.addActionListener(
    		new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				Label1.setVisible(true);
    				Text1.setVisible(true);
    				Label2.setVisible(false);
    				Text2.setVisible(false);
    				Label3.setVisible(false);
    				Text3.setVisible(false);
    				Label1.setText("Lado:");
    				Opcion = 'C';
    				c.Figura(Opcion);
       				c.repaint();
    			}
 		});
    	Cono.addActionListener(
 			new ActionListener(){
 				public void actionPerformed(ActionEvent e) {
 					Label1.setVisible(true);
    				Text1.setVisible(true);
    				Label2.setVisible(true);
    				Text2.setVisible(true);
    				Label3.setVisible(false);
    				Text3.setVisible(false);
    				Label1.setText("Radio:");
    				Label2.setText("Altura:");
    				Opcion = 'c';
    				c.Figura(Opcion);
       				c.repaint();
 				}	
 		});
    	Ortoedro.addActionListener(
 			new ActionListener(){
 				public void actionPerformed(ActionEvent e) {
 					Label1.setVisible(true);
    				Text1.setVisible(true);
    				Label2.setVisible(true);
    				Text2.setVisible(true);
    				Label3.setVisible(true);
    				Text3.setVisible(true);
    				Label1.setText("Base:");
    				Label2.setText("Altura:");
    				Label3.setText("Profundidad:");
    				Opcion = 'O';
    				c.Figura(Opcion);
       				c.repaint();
 				}
 		});
    	Area.addActionListener(
 			new ActionListener(){
 				public void actionPerformed(ActionEvent e) {
 					Area.setEnabled(false);
 					Volumen.setEnabled(true);
 			}
 		});
    	Volumen.addActionListener(
 			new ActionListener(){
 				public void actionPerformed(ActionEvent e) { 
 					Area.setEnabled(true);
 					Volumen.setEnabled(false);
 			}
 		});
    	
    	Calcular.addActionListener(
 			new ActionListener(){
 				public void actionPerformed(ActionEvent e) {
	    			if(!Area.isEnabled()) {
	    				if (Opcion == 'C') {
	    					if(Text1.getText() != null)
	    						Resultado.setText(String.valueOf(areaCubo(Double.parseDouble(Text1.getText()))));
	    				}    			    	
	    			    else if (Opcion == 'c') {
	    			    	if(Text1.getText() != null)
	    						Resultado.setText(String.valueOf(areaCono(Double.parseDouble(Text1.getText()),Double.parseDouble(Text1.getText()))));
	    				}
	    			    else if (Opcion == 'O') {
	    			    	if(Text1.getText() != null && Text2.getText() != null && Text3.getText() != null)
	    						Resultado.setText(String.valueOf(areaOrtoedro(Double.parseDouble(Text1.getText()),Double.parseDouble(Text2.getText()),Double.parseDouble(Text3.getText()))));
	    			    }
 					}
	    			else if(!Volumen.isEnabled()) {
	    				if (Opcion == 'C') {	
	    					if(Text1.getText() != null)
	    						Resultado.setText(String.valueOf(volumenCubo(Double.parseDouble(Text1.getText()))));	
	    				}    	 			    	
	    			    else if (Opcion == 'c') {
	    			    	if(Text1.getText() != null)
	    						Resultado.setText(String.valueOf(volumenCono(Double.parseDouble(Text1.getText()),Double.parseDouble(Text2.getText()))));
	    				}
	    			    else if (Opcion == 'O') {
	    			    	if(Text1.getText() != null)
	    						Resultado.setText(String.valueOf(volumenOrtoedro(Double.parseDouble(Text1.getText()),Double.parseDouble(Text2.getText()),Double.parseDouble(Text3.getText()))));
	    			    }
	    			}
 				}	
 		});
 	}
 	
 	static class CCanvas extends Canvas {
		private static final long serialVersionUID = 1L;
		private char Item;
		public void Figura (char Op) {
			Item = Op;
		}
		
		public void paint( Graphics g ) {
			g.setColor(Color.red);
		    int w = getSize().width;
		    int h = getSize().height;
		    g.drawRect( 0,0,w-1,h-1 );
		    g.drawString( "Canvas", ( w-g.getFontMetrics().stringWidth( "Canvas" ) )/2,10 );
		    g.setFont( new Font( "Helvetica",Font.PLAIN,17 ) );
		    if (Item == 'C') {
		    	g.setColor(Color.green);
		    	g.fillRect(30, 30, 150, 150);
				    
		 		g.setColor(Color.black);
		 	    g.drawRect(30, 30, 150, 150);
		    	g.drawRect(30, 30, 150, 150);
		    	g.drawString("VISTA DE LADO", 30, 200);
		    }
		    else if (Item == 'c') {
		    	g.setColor(Color.blue);
		    	g.setColor(Color.blue);
	            Polygon myPolygon=new Polygon();
				myPolygon.addPoint(90, 30);
				myPolygon.addPoint(150, 150);
				myPolygon.addPoint(30, 150);
				g.drawPolygon(myPolygon);
				g.drawString("VISTA DE LADO", 30, 200);
				g.drawOval(200, 40, 120, 120);
				g.drawString("VISTA DE BASE", 200, 200);
			}
		    else if (Item == 'O') {
		    	g.setColor(Color.pink);
		    	g.fillRect(30, 30, 100, 150);
				    
		 		g.setColor(Color.blue);
		 	    g.drawRect(30, 30, 100, 150);
		    	g.drawRect(30, 30, 100, 150);
		    	g.drawString("VISTA DE LADO", 30, 200);
		    	g.setColor(Color.pink);
		    	g.fillRect(140, 30, 100, 120);
		    	g.setColor(Color.blue);
		    	g.fillRect(30, 30, 100, 150);
		    	g.drawRect(140, 30, 100, 120);
		    	g.drawString("VISTA DE BASE", 140, 180);
		        g.setColor(Color.pink);
		    	g.fillRect(270, 30, 120, 150);
		    	g.setColor(Color.blue);
		    	g.fillRect(30, 30, 100, 150);
		    	g.drawRect(270, 30, 120, 150);
		    	g.drawString("VISTA DE PROFUNDIDAD", 250, 200);
		    }
	    }
		
	 }
	double areaCubo (double L) {
		return (6* Math.pow(L, 2));
	}
	double areaCono (double R, double g) {
		return (Math.PI*R*(g + R));
	}
	double areaOrtoedro (double a, double b, double c) {
		return (2 * (a*b + a*c + b*c));
	}
	
	double volumenCubo (double L) {
		return (Math.pow(L, 3));
	}
	double volumenCono (double R, double g) {
		return ((Math.PI*Math.pow(R, 2)*g)/3);
	}
	double volumenOrtoedro(double a, double b, double c) {
		return (a* b * c);	
	}
	
	public static void main( String args[] ) {
		AreasWithButtons ventana = new AreasWithButtons();
		ventana.setTitle( "EXAMEN FINAL");
		ventana.setSize( 750,350 );
		ventana.setVisible( true );
		ventana.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
                }
            }
		);
    }
}
//Apoyos para realizar este codigo:
//docs.oracle.com/javase/7/docs/api/java/awt/event/ActionListener.html
//chuwiki.chuidiang.org/index.php?title=ActionListener
//www.sc.ehu.es/sbweb/fisica/cursoJava/applets/ejemplos/dibujo/dibujo.htm
//www.forosdelweb.com/f45/graficar-bajo-demanda-con-paint-graphics-g-java-806210/
//www.forosdelweb.com/f45/pintar-forma-despues-presionar-boton-808510/
//dis.um.es/~bmoros/Tutorial/parte13/cap13-4.html
//laurel.datsi.fi.upm.es/_media/docencia/cursos/java/java2d.pdf
//www.chuidiang.org/java/graficos/simple/grafico_simple.php
//docs.oracle.com/javase/7/docs/api/java/awt/Canvas.html
//www.javatpoint.com/java-actionlistener
//docs.oracle.com/javase/tutorial/uiswing/events/actionlistener.html