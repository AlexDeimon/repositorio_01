package basicsOfLanguage;
public class TestCComputador {
	public static void main(String[] args) {
		Computador Computador01 =new Computador("DELL", 2, "LCD", 1500000);
		System.out.println("Marca del computador 1 es: "+Computador01.mostrar_Marca());
		System.out.println("Procesamiento del "+Computador01.mostrar_Marca()+ " es: "+Computador01.mostrar_procesador());
		System.out.println("Pantalla del "+Computador01.mostrar_Marca()+ " es: "+Computador01.mostrar_pantalla());
		System.out.println("precio del "+Computador01.mostrar_Marca()+ " es: "+Computador01.mostrar_precio());
		System.out.println(" ");
		Computador Computador02 =new Computador("LENOVO", 1, "AMOLED", 2000000);
		System.out.println("Marca del computador 2 es: "+Computador02.mostrar_Marca());
		System.out.println("Procesamiento del "+Computador02.mostrar_Marca()+ " es: "+Computador02.mostrar_procesador());
		System.out.println("Pantalla del "+Computador02.mostrar_Marca()+ " es: "+Computador02.mostrar_pantalla());
		System.out.println("precio del "+Computador02.mostrar_Marca()+ " es: "+Computador02.mostrar_precio());
	}

}
