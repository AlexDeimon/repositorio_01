package fundaConcepts;

public class CondiSentence {

	public static void main(String[] args) {
		float base =(float) 3.0;
		float height=(float) 6.0;
		float area =(float) 0.0;
		area = (float)(base*height/2.0);
		System.out.println("Area del triangulo de base "+base+" y altura "+height+" = "+area);
		if(area<14)
			System.out.println("Area menor que 14");
		else
			System.out.println("Area Mayor que 14");
	}
}

// 1. Utilizar una kte simbólica para el número 2.0 
// 2. Encontrar el área para tres triángulos (case)
// 3. Encontrar cuál de las áreas es la mayor, imprimirlas
//    en orden descendente.