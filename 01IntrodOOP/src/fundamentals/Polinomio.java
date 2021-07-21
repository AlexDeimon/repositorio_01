package fundamentals;
import java.util.Scanner;
public class Polinomio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x;
		double p;
		System.out.print("Digite el valor de x: ");
        x = sc.nextInt();
        p=3*Math.pow(x, 5)- 5*Math.pow(x, 3) +2*x - 7 ;
        System.out.println("Para x= "+ x+ ", p = 3x^5 - 5x^3 + 2x -7 = "+p);
	}

}
