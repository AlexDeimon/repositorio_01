package areasYVolumenes;

abstract class ClaseAbstracta {
	private int lado;
	private int base01;
	private int altura;
	private int diagonal01;
	private int diagonal02;
	private int base02;
	private int NumeroLados;
	private int radio01;
	private int radio02;
	private int angulo;
	private int profundidad;
	private int generatriz;
	
	public ClaseAbstracta() {
		lado=(int)(Math.random()*10) + 1;
		base01=(int)(Math.random()*10) + 1;
		altura=(int)(Math.random()*10) + 1;
		diagonal01=(int)(Math.random()*10) + 1;
		diagonal02=(int)(Math.random()*10) + 1;
		base02=(int)(Math.random()*10) + 1;
		NumeroLados=(int)(Math.random()*10) + 4;
		radio01=(int)(Math.random()*10)+1;
		radio02=(int)(Math.random()*10)+1;
		angulo=(int)(Math.random()*360)+1;
		profundidad=(int)(Math.random()*10) + 1;
		generatriz=(int)(Math.random()*10) + 1;
	}
	
	public void Assig_lado(int pw_lado) {
		this.lado=pw_lado;
	}
	public void Assig_base01(int pw_base01) {
		this.base01=pw_base01;
	}
	public void Assig_altura(int pw_altura) {
		this.altura=pw_altura;
	}
	public void Assig_diagonal01(int pw_diagonal01) {
		this.diagonal01=pw_diagonal01;
	}
	public void Assig_diagonal02(int pw_diagonal02) {
		this.diagonal02=pw_diagonal02;
	}
	public void Assig_base02(int pw_base02) {
		this.base02=pw_base02;
	}
	public void Assig_NumeroLados(int pw_NumeroLados) {
		this.NumeroLados=pw_NumeroLados;
	}
	public void Assig_angulo(int pw_angulo) {
		this.angulo=pw_angulo;
	}
	public void Assig_radio01(int pw_radio01) {
		this.radio01=pw_radio01;
	}
	public void Assig_radio02(int pw_radio02) {
		this.radio02=pw_radio02;
	}
	public void Assig_profundidad(int pw_profundidad) {
		this.profundidad=pw_profundidad;
	}
	public void Assig_generatriz(int pw_generatriz) {
		this.generatriz=pw_generatriz;
	}
	
	public int show_lado() {
		return lado;
	}
	public int show_base01() {
		return base01;
	}
	public int show_altura() {
		return altura;
	}
	public int show_diagonal01() {
		return diagonal01;
	}
	public int show_diagonal02() {
		return diagonal02;
	}
	public int show_base02() {
		return base02;
	}
	public int show_NumeroLados() {
		return NumeroLados;
	}
	public int show_radio01() {
		return radio01;
	}
	public int show_radio02() {
		return radio02;
	}
	public int show_angulo() {
		return angulo;
	}
	public int show_profundidad() {
		return profundidad;
	}
	public int show_generatriz() {
		return generatriz;
	}
}		