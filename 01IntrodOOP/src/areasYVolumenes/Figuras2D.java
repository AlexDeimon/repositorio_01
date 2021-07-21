package areasYVolumenes;

public class Figuras2D extends ClaseAbstracta{
	private int AreaCuadrado;
	private double AreaTriangulo;
	private int AreaRectangulo;
	private int AreaRomboide;
	private double AreaRombo;
	private double AreaTrapecio;
	private int perimetro;
	private double apotema;
	private double AreaPoligonoRegular;
	private double AreaCirculo;
	private double AreaCoronaCircular;
	private double AreaSectorCircular;
	public Figuras2D(){
	}
	
	public int AreaCuadrado() {
		AreaCuadrado= (int) Math.pow(show_lado(), 2);
		return AreaCuadrado;
	}
	public double AreaTriangulo() {
		AreaTriangulo= ((show_base01())*(show_altura()))*0.5;
		return AreaTriangulo;
	}
	public int AreaRectangulo() {
		AreaRectangulo= (show_base01())*(show_altura());
		return AreaRectangulo;
	}
	public int AreaRomboide() {
		AreaRomboide= (show_base01())*(show_altura());
		return AreaRomboide;
	}
	public double AreaRombo() {
		AreaRombo= ((show_diagonal01())*(show_diagonal02()))/2;
		return AreaRombo;
	}
	public double AreaTrapecio() {
		AreaTrapecio=(((show_base01())+(show_base02()))*0.5)*(show_altura());
		return AreaTrapecio;
	}
	public int perimetro() {
		perimetro=(show_lado())*(show_NumeroLados());
		return perimetro;
	}
	public double apotema() {
		apotema=(show_lado())/(2*(Math.tan((360/(show_NumeroLados()))/2)));
		return apotema;
	}
	public double AreaPoligonoRegular() {
		AreaPoligonoRegular=((perimetro)*(apotema))/2;
		return AreaPoligonoRegular;
	}
	public double AreaCirculo() {
		AreaCirculo=(Math.PI)*(Math.pow(show_radio01(), 2));
		return AreaCirculo;
	}
	public double AreaCoronaCircular() {
		AreaCoronaCircular=(Math.PI)*((Math.pow(show_radio01(), 2)-Math.pow(show_radio02(), 2)));
		return AreaCoronaCircular;
	}
	public double AreaSectorCircular() {
		AreaSectorCircular=(((Math.PI)*(Math.pow(show_radio01(), 2)))/360)*show_angulo();
		return AreaSectorCircular;
	}
}