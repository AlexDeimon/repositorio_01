// 1. Con dos cadenas de caracteres, comprobar si
//    tienen el mismo contenido utilizando substring
package charaStrings;
import java.util.Scanner;
public class WithSubstr {

	public static void main(String[] args) {
		Scanner objeto1 = new Scanner(System.in);
        System.out.print("DIGITE SU PRIMER CADENA: ");
        String s=objeto1.nextLine();
        System.out.print("DIGITE SU SEGUNDA CADENA: ");
        String z=objeto1.nextLine();
        String s1=s.substring(0);
        String z1=z.substring(0);
        System.out.println(s1);
        System.out.println(z1);
		if(s1==z1) 
			System.out.println("LAS CADENAS SON IGUAlES");
		else
			System.out.println("LAS CADENAS SON DIFERENTES");
		}
}