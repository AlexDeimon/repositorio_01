package fundamentals;
import java.util.Scanner;
public class PolinomioVariable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x;
		double p;
		int a, b, c;
		System.out.println("p= Ax^5 - Bx^3 + Cx -7 ");
		System.out.print("Digite el valor de A: ");
		a=sc.nextInt();
		System.out.print("Digite el valor de B: ");
		b=sc.nextInt();
		System.out.print("Digite el valor de C: ");
		c=sc.nextInt();
		System.out.print("Digite el valor de x: ");
		x = sc.nextInt();
		p=a*Math.pow(x, 5)- b*Math.pow(x, 3) +c*x - 7 ;
		System.out.println("Para x= "+ x+ ", p = "+a+"x^5 - "+b+"x^3 + "+c+"x -7 = "+p);
	}

}
