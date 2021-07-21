package fundamentals;
import java.util.Scanner;
public class Volumen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double radio, volumen;
        System.out.print("Digite el radio de la esfera: ");
        radio = sc.nextDouble();
        System.out.println("VOLUMEN DE LA ESFERA DE RADIO: " + radio + " = " + ((4)* Math.PI * Math.pow(radio, 3)/3));
	}

}
