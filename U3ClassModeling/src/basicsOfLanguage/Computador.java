package basicsOfLanguage;
public class Computador {
	private String Marca;
	private String pantalla;
	private int precio;
	public Computador() {
	}
	public Computador(String pw_Marca, int pw_Com_Tipo_Proc, String pw_pantalla, int pw_precio) {
		Marca=pw_Marca;
		pantalla=pw_pantalla;
		precio=pw_precio;
		Com_Tipo_Proc=pw_Com_Tipo_Proc;
	}
	static int Com_Tipo_Proc;
	public void Procesador(int pw_Com_Tipo_Proc) {
		pw_Com_Tipo_Proc=Com_Tipo_Proc;
		
	}
	public void asignar_Marca(String pw_Marca) {
		Marca=pw_Marca;
	}
	public void asignar_pantalla(String pw_pantalla) {
		pantalla=pw_pantalla;
	}
	public void asignar_precio(int pw_precio) {
		precio=pw_precio;
	}
	public String mostrar_Marca() {
		return Marca;
	}
	public String mostrar_pantalla() {
		return pantalla;
	}
	public int mostrar_precio() {
		return precio;
	}
	public int mostrar_procesador() {
		if (Com_Tipo_Proc==1) {
			System.out.println("Procesamiento lineal");
		} else if(Com_Tipo_Proc==2){
			System.out.println("Procesamiento paralelo");
		} else {
			System.out.println("Procesamiento Simétrico");
		}
		return Com_Tipo_Proc;
	}
}