package areasYVolumenes;

public class TestFiguras3D {
	public static void main(String[] args) {
		Figuras3D obj01=new Figuras3D();
		System.out.println("El Area del cubo de lado: "+obj01.show_lado()+" es igual a "+obj01.AreaCubo()+", y el volumen es igual a "+obj01.VolumenCubo()+"\n");
		Figuras3D obj02=new Figuras3D();
		System.out.println("El Area del cilindro de radio: "+obj02.show_radio01()+", y altura "+obj02.show_altura()+ " es igual a "+obj02.AreaCilindro()+", y el volumen es igual a " +obj02.VolumenCilindro()+"\n");
		Figuras3D obj03=new Figuras3D();
		System.out.println("El Area del ortoedro de base: "+obj03.show_base01()+", altura: "+obj03.show_altura()+" y profundidad: "+obj03.show_profundidad()+" es igual a "+obj03.AreaOrtoedro()+" y el volumen es igual a "+obj03.VolumenOrtoedro()+"\n");
		Figuras3D obj04=new Figuras3D();
		System.out.println("El Area del cono de radio: "+obj04.show_radio01()+",  generatriz: "+obj04.show_generatriz()+" y altura: "+obj04.show_altura()+" es igual a "+obj04.AreaCono()+", y el volumen es igual a "+obj04.VolumenCono()+"\n");
		Figuras3D obj05=new Figuras3D();
		System.out.println("El prisma recto de numero de lados: "+obj05.show_NumeroLados()+" que miden: "+obj05.show_lado()+" tiene un perimetro de "+obj05.perimetro()+", un apotema de "+obj05.apotema()+" y una altura de "+obj05.show_altura());
		System.out.println("por lo cual su area es de: "+obj05.AreaPrismaRecto()+" y su volumen es de: "+obj05.VolumenPrismaRecto()+"\n");
		Figuras3D obj06=new Figuras3D();
		System.out.println("El Area del Tronco de cono de radio 1: "+obj06.show_radio01()+", radio 2: "+obj06.show_radio02()+", generatriz: "+obj06.show_generatriz() +", y altura: "+obj06.show_altura()+" es igual a "+obj06.AreaTrocoCono()+", y su voulmen es igual a: "+ obj06.VolumenTroncoCono()+ "\n");
		Figuras3D obj07=new Figuras3D();
		System.out.println("El Area del Tetaedro Regular de lado: "+obj07.show_lado()+" es igual a "+obj07.AreaTetaedroRegular()+", y su volumen es igual a "+obj07.VolumenTetaedroRegular()+"\n");
		Figuras3D obj08=new Figuras3D();
		System.out.println("El Area de la esfera de radio: "+obj08.show_radio01()+" es igual a "+obj08.AreaEsfera()+", y su volumen es igual a "+obj08.VolumenEsfera()+"\n");
		Figuras3D obj09=new Figuras3D();
		System.out.println("El Area del Octaedro Regular de lado: "+obj09.show_lado()+" es igual a "+obj09.AreaOctaedroRegular()+", y su volumen es igual a "+obj09.VolumenOctaedroRegular()+"\n");
		Figuras3D obj10=new Figuras3D();
		System.out.println("El Area del Huso de radio: "+obj10.show_radio01()+", y angulo: "+obj10.show_angulo()+" es igual a "+obj10.AreaHuso()+", y su volumen es igual a "+obj10.VolumenHuso()+"\n");
		Figuras3D obj11=new Figuras3D();
		System.out.println("La piramide regular de numero de lados: "+obj11.show_NumeroLados()+" que miden: "+obj11.show_lado()+" tiene un perimetro de "+obj11.perimetro()+", un apotema de base de "+obj11.apotema()+", un apotema de piramide de "+obj11.apotemaPiramide());
		System.out.println("y una altura de "+obj11.show_altura()+ ", por lo cual su area es de: "+obj11.AreaPiramideRegular()+" y su volumen es de: "+obj11.VolumenPiramideRegular()+"\n");
		Figuras3D obj12=new Figuras3D();
		System.out.println("El Area del Casquete esferico de radio: "+obj12.show_radio01()+" y altura "+obj12.show_altura()+ " es igual a "+obj12.AreaCasqueteEsferico()+", y su volumen es igual a "+obj12.VolumenCasqueteEsferico()+"\n");
		Figuras3D obj13=new Figuras3D();
		System.out.println("El Area de la zona esferica de radio 1: "+obj13.show_radio01()+", radio 2: "+obj13.show_radio02()+" y altura "+obj13.show_altura()+ " es igual a "+obj13.AreaZonaEsferica()+" y su volumen es igual a "+obj13.VolumenZonaEsferica()+"\n");
	}
}