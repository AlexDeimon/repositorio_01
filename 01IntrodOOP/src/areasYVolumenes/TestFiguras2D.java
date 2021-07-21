package areasYVolumenes;
public class TestFiguras2D {
	public static void main(String[] args) {
		Figuras2D obj01=new Figuras2D();
		System.out.println("El Area del Cuadrado con lado: "+ obj01.show_lado() +" es igual a "+ obj01.AreaCuadrado()+"\n");
		Figuras2D obj02=new Figuras2D();
		System.out.println("El Area del Triangulo con base: "+ obj02.show_base01() +" y altura: "+ obj02.show_altura()+ " es igual a "+ obj02.AreaTriangulo()+"\n");
		Figuras2D obj03=new Figuras2D();
		System.out.println("El Area del Rectangulo con base: "+ obj03.show_base01() +" y altura: "+ obj03.show_altura()+ " es igual a "+ obj03.AreaRectangulo()+"\n");
		Figuras2D obj04=new Figuras2D();
		System.out.println("El Area del Romboide con base: "+ obj04.show_base01() +" y altura: "+ obj04.show_altura()+ " es igual a "+ obj04.AreaRomboide()+"\n");
		Figuras2D obj05=new Figuras2D();
		System.out.println("El Area del Rombo con diagonal 1: "+ obj05.show_diagonal01() +" y diagonal 2: "+ obj05.show_diagonal02()+ " es igual a "+ obj05.AreaRombo()+"\n");
		Figuras2D obj06=new Figuras2D();
		System.out.println("El Area del trapecio con base 1: "+ obj06.show_base01() +", base 2: "+ obj06.show_base02()+" y altura: "+obj06.show_altura() +" es igual a "+ obj06.AreaTrapecio()+"\n");
		Figuras2D obj07=new Figuras2D();
		System.out.println("El Poligono regular de numero de lados: "+obj07.show_NumeroLados()+" que miden: "+obj07.show_lado()+" tiene un perimetro de "+obj07.perimetro()+" y un apotema de "+obj07.apotema()+", por lo cual su area es de: "+obj07.AreaPoligonoRegular()+"\n");
		Figuras2D obj08=new Figuras2D();
		System.out.println("El Area del Circulo con radio "+ obj08.show_radio01() +" es igual a "+ obj08.AreaCirculo()+"\n");
		Figuras2D obj09=new Figuras2D();
		System.out.println("El Area de la Corona Circular con radio mayor: "+ obj09.show_radio01() +" y radio menor: "+obj09.show_radio02() +" es igual a "+ obj09.AreaCoronaCircular()+"\n");
		Figuras2D obj10=new Figuras2D();
		System.out.println("El Area del Sector Circular con radio: "+ obj10.show_radio01() +" y angulo: "+obj10.show_angulo() +" es igual a "+ obj10.AreaSectorCircular()+"\n");
	}
}