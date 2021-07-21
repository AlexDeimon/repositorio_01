// 1. Cargar el vector descartando los números impares
// 2. Encontrar la suma de los valores cargados en el vector
// 3. Encontrar el mayor valor cargado en el vector
// 4. Ordenar el vector mediante el método de burbuja
// 5. Ordenar el vector mediante el método de Quick sort.
package arrays;
import java.util.Scanner;
public class VectoRand {
	static int vector[]=new int [10];
	static int i=0;
	static int primero;
	static int ultimo;
	public static void main(String[] args) {
		int now;
		Scanner objeto1=new Scanner(System.in);
		do{
			System.out.println("1. Vector aleatoreo");
            System.out.println("2. Numeros Pares");
            System.out.println("3. Sumatoria");
            System.out.println("4. Mayor");
            System.out.println("5. Metodo burbuja");
            System.out.println("6. Metodo Quick sort");
            System.out.println("7. Salir");
            System.out.println();
            System.out.print("INGRESE UNA OPCION:");
            now=objeto1.nextInt();
            if(now>=1&& now<=7){
                switch(now){
                    case 1:VectorAleatoreo();break;
                    case 2:NumerosPares();break;
                    case 3:Sumatoria();break;
                    case 4:Mayor();break;
                    case 5:Burbuja();break;
                    case 6:QuickSort();break;
                    case 7:System.out.println("EL PROGRAMA HA TERMINADO");
                }
            }else
                System.out.println(now+" NO ES UN VALOR ENTRE 1 Y 6" );
            }while(now!=7);
        }
	public static void VectorAleatoreo() {
		do {
			vector[i]=(int) (Math.random() * 10);
			System.out.print(vector[i]+"\t");
			i=i+1;
		}while(i<10);
		System.out.println("");
		}
	public static void NumerosPares() {
		System.out.print("Estos son los numeros pares: ");
		for(i=0;i<vector.length; i++) {
			if(vector[i]%2==0)
				System.out.print("\t"+vector[i]);
			}
		System.out.println("");
		}
	public static void Sumatoria() {
		int suma=0;
		for(i=0; i<vector.length; i++) {
			suma+=vector[i];
			}
		System.out.println("Sumatoria de los valores: "+suma);
		System.out.println("");
		}
	public static void Mayor() {
		int mayor=0;
		for(i=0; i<vector.length; i++) {
			if(mayor<vector[i]) {
				mayor=vector[i];
				}
			}
		System.out.println("valor mayor del vector: "+mayor);
		}
	public static void Burbuja() {
		int j, aux;
		for(i=0;i<vector.length-1;i++) {
			for(j=0;j<vector.length-i-1;j++) {
				if(vector[j+1]<vector[j]) {
					aux=vector[j+1];
					vector[j+1]=vector[j];
					vector[j]=aux;
					}
				}
			}
		System.out.print("Vector ordenado: ");
		for(int i=0;i<vector.length;i++) {  
			System.out.print(+vector[i]+"\t");
			}
		System.out.println(" ");
		}
	
	public static void quicksort(int vector[],int primero, int ultimo) {
		int central,i,j;
		 int pivote;
		 central=(primero+ultimo)/2;
		 pivote=vector[central];
		 i=primero;
		 j=ultimo;
		 do{
		   while(vector[i]<pivote) i++;
		   while(vector[j]>pivote) j--;
		   if(i<=j){
		    int temp;
		    temp=vector[i];
		    vector[i]=vector[j]; 
		    vector[j]=temp;
		    i++;
		    j--;
		   }
		  }
		 
		 while(i<=j);
		 if(primero<j)
		  quicksort(vector,primero,j); 
		 if(i<ultimo)
		  quicksort(vector,i,ultimo); 
		}
	
	public static void QuickSort() {
		quicksort(vector,0,vector.length-1);
        System.out.print("Vector ordenado: ");
        for(int i =0; i<vector.length;i++){
        	System.out.print(+vector[i]+"\t");
     }
        System.out.println(" ");
	}
}
