/*
Comments
 1. Encontrar si la cadena de caracteres es palíndroma
 2. Mostrar la cadena de caracteres invertida
 3. Cargar la cadena de caracteres de manera aleatoria,
    solamente con caracteres que representan dígitos.
 4. Convertir la cadena de caracteres a su correspondiente
    valor numérico.
 5. Descartar los caracteres que no son significativos para
   la cadena.*/
package charaStrings;
import java.util.Scanner;
public class CharAtSubstr {
	static String s;
	public static void main(String[] args) {
		Scanner objeto2=new Scanner(System.in);
		System.out.print("DIGITE SU CADENA: ");
		s=objeto2.nextLine();
		int now;
		Scanner objeto1=new Scanner(System.in);
		do{
            System.out.println("1. ¿Cadena palindroma?");
            System.out.println("2. Cadena invertida");
            System.out.println("3. Cadena aleatoria");
            System.out.println("4. Valores numericos ASCII de la cadena");
            System.out.println("5. Salir");
            System.out.println();
            System.out.print("INGRESE UNA OPCION:");
            now=objeto1.nextInt();
            if(now>=1&& now<=5){
            	switch(now){
                    case 1:Palindromo();break;
                    case 2:Invert();break;
                    case 3:Rand();break;
                    case 4:StringToNumber();break;
                    case 5:System.out.println("EL PROGRAMA HA TERMINADO");
                    }
            	}else
                System.out.println(now+" NO ES UN VALOR ENTRE 1 Y 5" );
            }while(now!=5);
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
	public static void Palindromo(){
		CharAtSubstr objclass=new CharAtSubstr();
		if(objclass.esPalindromo(s)){
			System.out.println("LA CADENA ES PALINDROMA");
			}
			else
			{
			System.out.println("LA CADENA NO ES PALINDROMA");
			}	
	}
	public static String invertedString(String d) {
			int ls=d.length();
			StringBuilder t=new StringBuilder(ls);
			for(int i=(ls-1); i>=0; i--)
				t.append(d.charAt(i));
			return(t.toString());
		}
	public static void Invert() {
		CharAtSubstr objclass=new CharAtSubstr();
		System.out.println("CADENA INVERTIDA: "+invertedString(s));
	}
	public static void Rand() {
		int vector[]=new int [s.length()];
		int i=0;
		System.out.print("CADENA ALEATORIA DE NUMEROS: ");
		do {
			vector[i]=(int) (Math.random() * s.length());
			System.out.print(+vector[i]+"\t");
			i=i+1;
		}while(i<s.length());
		System.out.println("");
	}
	public static void StringToNumber() {//Decidi convertirlos a su valor ASCII porque no logre convertirlos a su valor numerico correspondiente
		 int nameLenght = s.length(); 
		 System.out.println("VALORES ASCII DE LA CADENA: ");
		    for(int i = 0; i < nameLenght ; i++){      
		        char character = s.charAt(i); 
		        int ascii = (int) character; 
		        System.out.println(character+" = "+ ascii);
		    }
	}
}


