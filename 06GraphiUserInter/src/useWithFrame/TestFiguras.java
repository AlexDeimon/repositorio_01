package useWithFrame;
import javax.swing.*;
import java.awt.*;

public class TestFiguras extends JFrame{
     public TestFiguras(){
          setSize(800,800);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setLocationRelativeTo(null);
          setVisible(true);
     }

     public static void main(String a[]){
         new TestFiguras();
     }

     public void paint(Graphics g){
          g.drawOval(40, 40, 80, 80); //Dibuja un circulo
          g.drawRect(170, 40, 200, 200); // Dibuja un cuadrado
          g.drawRect(420, 40, 100, 200); // Dibuja un rectángulo
     }
}