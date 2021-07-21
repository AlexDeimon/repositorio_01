// 1. Dada una cadena de caracteres, verificar si todos 
//    los caracteres son mayúsculas o minúsculas, si no son
//    todos mayúsculas o minúsculas, indicar cuántos son
//    mayúsculas y cuántos minúsculas.
package charaStrings;
import java.util.Scanner;
public class UpperLower {

	public static void main(String[] args) {
		Scanner objeto1 = new Scanner(System.in);
        System.out.print("DIGITE SU CADENA: ");
        String s=objeto1.nextLine();
        int UpperCase=0;
        int LowerCase=0;
        for (int k = 0; k < s.length(); k++) {
            if (Character.isUpperCase(s.charAt(k))) UpperCase++;
            if (Character.isLowerCase(s.charAt(k))) LowerCase++;
        }
        System.out.printf("Hay %d caracteres en mayúscula y %d caracteres en minúscula.",UpperCase,LowerCase);
        System.out.println(" ");
		System.out.println("Cadena original: "+ s);
		String sMayus=s.toUpperCase();
		String sMinus=s.toLowerCase();
		System.out.println("Cadena en mayúsculas: "+ sMayus);
		System.out.println("Cadena en minúsculas: "+ sMinus);
	}
}
