package charaStrings;
import java.util.Scanner;
public class Palindroma {
	static String s;
	public static void main(String[] args) {
		Scanner objeto2=new Scanner(System.in);
		System.out.print("DIGITE SU CADENA: ");
		s=objeto2.nextLine();
		Palindroma objclass=new Palindroma();
		if(objclass.esPalindromo(s)){
			System.out.println("LA CADENA ES PALINDROMA");
			}
			else
			{
			System.out.println("LA CADENA NO ES PALINDROMA");
			}	
	}
	public static boolean esPalindromo(String cadena) {
		boolean valor=true;
		int i,ind;
		String cadena2="";
		for (int x=0; x < cadena.length(); x++) {
			if (cadena.charAt(x) != ' ')
				cadena2 += cadena.charAt(x);
			}
		cadena=cadena2;
		ind=cadena.length();
		for (i= 0 ;i < (cadena.length()); i++){
			if (cadena.substring(i, i+1).equals(cadena.substring(ind - 1, ind)) == false ) {
				valor=false;break;
				}
			ind--;
			}
		return valor;
		}

	}
