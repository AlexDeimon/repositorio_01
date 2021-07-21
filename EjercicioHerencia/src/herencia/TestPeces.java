package herencia;
public class TestPeces {
	public static void main(String[] args) {
		Peces Tipo_Pez1=new Peces(500, 8, "tiburon ballena", 6, 120);
		System.out.println("Nombre del pez 1 es: "+Tipo_Pez1.mostrar_nombre());
		System.out.println("Peso de "+Tipo_Pez1.mostrar_nombre()+ " es: "+Tipo_Pez1.Mostrar_peso()+ " Kg");
		System.out.println("Edad de "+Tipo_Pez1.mostrar_nombre()+ " es: "+Tipo_Pez1.Mostrar_edad()+ " años");
		System.out.println("Numero de aletas de "+Tipo_Pez1.mostrar_nombre()+ " es: "+Tipo_Pez1.mostrar_aletas()+ " aletas");
		System.out.println("Numero de dientes de "+Tipo_Pez1.mostrar_nombre()+ " es: "+Tipo_Pez1.mostrar_dientes()+ " dientes");
		System.out.println(" ");
		Peces Tipo_Pez2 = new Peces(250, 6, "pargo rojo", 5, 90);
		System.out.println("Nombre del pez 2 es: "+Tipo_Pez2.mostrar_nombre());
		System.out.println("Peso de "+Tipo_Pez2.mostrar_nombre()+ " es: "+Tipo_Pez2.Mostrar_peso()+ " Kg");
		System.out.println("Edad de "+Tipo_Pez2.mostrar_nombre()+ " es: "+Tipo_Pez2.Mostrar_edad()+ " años");
		System.out.println("Numero de aletas de "+Tipo_Pez2.mostrar_nombre()+ " es: "+Tipo_Pez2.mostrar_aletas()+ " aletas");
		System.out.println("Numero de dientes de "+Tipo_Pez2.mostrar_nombre()+ " es: "+Tipo_Pez2.mostrar_dientes()+ " dientes");
	}

}
