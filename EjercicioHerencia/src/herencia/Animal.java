package herencia;
public class Animal {
	private float peso;
	private int edad;
	public Animal() {
		peso=(float) 0.0;
		edad=0;
	}
	public Animal(float pw_peso, int pw_edad) {
	peso=pw_peso;
	edad=pw_edad;
	}
	public void Asignar_edad(int pw_edad) {
		edad=pw_edad;
	}
	public void Asignar_peso(float pw_peso) {
		peso=pw_peso;
	}
	public int Mostrar_edad() {
		return edad;
	}
	public float Mostrar_peso() {
		return peso;
	}
}
