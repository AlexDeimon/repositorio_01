package fundaConcepts;

public class ThreeAreasTriangle {

	public static void main(String[] args) {
		float base =(float) 3.0;
		float height=(float) 6.0;
		float area =(float) 0.0;
		float tarea=(float) 0.0;
		int ttriangle=0;
		int i=1;
		while(i<4) {
			base+=2;
			height+=2;
			area = (float)(base*height/2.0);
			System.out.println("Area del triangulo "+i+" de base "+base+" y altura "+height+" = "+area);
			if(area>tarea) {
				tarea=area;
				ttriangle=i;
			}
			i++;
		}
		System.out.println("El area de mayor valor es: "+tarea+", del triangulo "+ttriangle);
	}
}
// 1. Encontrar los valores de altura y base de manera
//    aleatoria para hacer menor previsible los resultados
