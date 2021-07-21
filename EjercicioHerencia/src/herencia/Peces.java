package herencia;
public class Peces extends Animal{
	private String nombre;
	private int aletas;
	private int dientes;
	public Peces() {
	}
	public Peces(float pw_pez_peso, int pw_pez_edad, String pw_nombre, int pw_aletas, int pw_dientes) {
		super(pw_pez_peso, pw_pez_edad);
		nombre=pw_nombre;
		aletas=pw_aletas;
		dientes=pw_dientes;
	}
	public void asignar_nombre(String pw_nombre) {
		nombre=pw_nombre;
	}
	public void asignar_aletas(int pw_aletas) {
		aletas=pw_aletas;
	}
	public void asignar_dientes(int pw_dientes) {
		dientes=pw_dientes;
	}
	public String mostrar_nombre() {
		return nombre;
	}
	public int mostrar_aletas() {
		return aletas;
	}
	public int mostrar_dientes() {
		return dientes;
	}
}
