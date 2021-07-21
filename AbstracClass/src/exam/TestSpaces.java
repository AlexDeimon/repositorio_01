package exam;

public class TestSpaces {

	public static void main(String[] args) {
		SpaceCaracts space01 =new SpaceCaracts("Casa",400,60000000,3,2,"No incluidos","Incluida");
		System.out.println("El espacio 1 es: "+space01.Show_space());
		System.out.println("El espacio 1 tiene "+space01.Show_meters()+" metros");
		System.out.println("El espacio 1 cuesta: "+space01.Show_price()+" pesos");
		System.out.println("El espacio 1 tiene: "+space01.Show_bedrooms()+" cuartos");
		System.out.println("El espacio 1 tiene: "+space01.Show_bathrooms()+" baños");
		System.out.println("Muebles: "+space01.Show_furniture());
		System.out.println("Chimenea: "+space01.Show_chimney());
		System.out.println(" ");
		SpaceCaracts space02 =new SpaceCaracts("Apartamento",200,35000000,2,2,"Incluidos","No incluida");
		System.out.println("El espacio 2 es: "+space02.Show_space());
		System.out.println("El espacio 2 tiene "+space02.Show_meters()+" metros");
		System.out.println("El espacio 2 cuesta: "+space02.Show_price()+" pesos");
		System.out.println("El espacio 2 tiene: "+space02.Show_bedrooms()+" cuartos");
		System.out.println("El espacio 2 tiene: "+space02.Show_bathrooms()+" baños");
		System.out.println("Muebles: "+space02.Show_furniture());
		System.out.println("Chimenea: "+space02.Show_chimney());
		System.out.println(" ");

	}

}
