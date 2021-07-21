// 1. Encontrar la desviación estándar
package arrays;
public class ArithmetMean {
	
	public static void main(String[] args) {
		final int size = 20;
		int []numberBase = new int[20];
		double aritMean=0.00;
		double desvEst=0.00;
		double varianza=0.00;
		int i;
		for(i=0; i<size; i++) { 
			numberBase[i]=(int)(Math.random()*10);
			aritMean=(double)(aritMean+numberBase[i]);
		}
		aritMean=(double) (aritMean/numberBase.length);
		for(i=0;i<size;i++){
			double rango;
			rango = Math.pow(numberBase[i]-aritMean,2f);
			varianza = varianza + rango;
			  }
		varianza = varianza/20f;
		 desvEst= Math.sqrt(varianza);
		System.out.println("length of array = "+numberBase.length+"\nmedia artimética = "+aritMean+"\nvarianza: "+varianza+"\nDesviacion estandar: " +desvEst);
	}
}

