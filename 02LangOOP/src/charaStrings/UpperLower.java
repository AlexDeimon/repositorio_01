// 1. Dada una cadena de caracteres, verificar si todos 
//    los caracteres son may�sculas o min�sculas, si no son
//    todos may�sculas o min�sculas, indicar cu�ntos son
//    may�sculas y cu�ntos min�sculas.
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
        System.out.printf("Hay %d caracteres en may�scula y %d caracteres en min�scula.",UpperCase,LowerCase);
        System.out.println(" ");
		System.out.println("Cadena original: "+ s);
		String sMayus=s.toUpperCase();
		String sMinus=s.toLowerCase();
		System.out.println("Cadena en may�sculas: "+ sMayus);
		System.out.println("Cadena en min�sculas: "+ sMinus);
	}
}
