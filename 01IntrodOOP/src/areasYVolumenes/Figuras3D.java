package areasYVolumenes;

public class Figuras3D extends ClaseAbstracta{
	private int AreaCubo;
	private int VolumenCubo;
	private double AreaCilindro;
	private double VolumenCilindro;
	private int AreaOrtoedro;
	private int VolumenOrtoedro;
	private double AreaCono;
	private double VolumenCono;
	private int perimetro;
	private double apotema;
	private double AreaPrismaRecto;
	private double VolumenPrismaRecto;
	private double AreaTroncoCono;
	private double VolumenTroncoCono;
	private double AreaTetaedroRegular;
	private double VolumenTetaedroRegular;
	private double AreaEsfera;
	private double VolumenEsfera;
	private double AreaOctaedroRegular;
	private double VolumenOctaedroRegular;
	private double AreaHuso;
	private double VolumenHuso;
	private double apotemaPiramide;
	private double AreaPiramideRegular;
	private double VolumenPiramideRegular;
	private double AreaCasqueteEsferico;
	private double VolumenCasqueteEsferico;
	private double AreaZonaEsferica;
	private double VolumenZonaEsferica;
	public Figuras3D() {
	}
	
	public int AreaCubo() {
		AreaCubo=6*((int)(Math.pow(show_lado(),2)));
		return AreaCubo;
	}
	public int VolumenCubo() {
		VolumenCubo=(int)(Math.pow(show_lado(),3));
		return VolumenCubo;
	}
	public double AreaCilindro() {
		AreaCilindro=2*Math.PI*show_radio01()*(show_altura()+show_radio01());
		return AreaCilindro;
	}
	public double VolumenCilindro() {
		VolumenCilindro=Math.PI*((int)(Math.pow(show_radio01(),2)))*show_altura();
		return VolumenCilindro;
	}
	public int AreaOrtoedro() {
		AreaOrtoedro=2*((show_base01()*show_profundidad())+(show_base01()*show_altura())+(show_profundidad()*show_altura()));
		return AreaOrtoedro;
	}
	public int VolumenOrtoedro() {
		VolumenOrtoedro=show_base01()*show_altura()*show_profundidad();
		return VolumenOrtoedro;
	}
	public double AreaCono() {
		AreaCono=Math.PI*show_radio01()*(show_generatriz()+show_radio01());
		return AreaCono;
	}
	public double VolumenCono() {
		VolumenCono=(Math.PI*((int)(Math.pow(show_radio01(),2)))*show_altura())/3;
		return VolumenCono;
	}
	public int perimetro() {
		perimetro=(show_lado())*(show_NumeroLados());
		return perimetro;
	}
	public double apotema() {
		apotema=(show_lado())/((2)*(Math.tan((360/(show_NumeroLados()))*0.5)));
		return apotema;
	}
	public double AreaPrismaRecto() {
		AreaPrismaRecto=perimetro*(show_altura()+apotema);
		return AreaPrismaRecto;
	}
	public double VolumenPrismaRecto() {
		VolumenPrismaRecto=AreaPrismaRecto*show_altura();
		return VolumenPrismaRecto;
	}
	public double AreaTrocoCono() {
		AreaTroncoCono=Math.PI*(show_generatriz()*(show_radio01()+show_radio02())+(int)(Math.pow(show_radio01(),2))+(int)(Math.pow(show_radio02(),2)));
		return AreaTroncoCono;
	}
	public double VolumenTroncoCono() {
		VolumenTroncoCono=(Math.PI*show_altura()*((((int)(Math.pow(show_radio01(),2)))+(int)(Math.pow(show_radio02(),2)))+(show_radio01()*show_radio02())))/3;
		return VolumenTroncoCono;
	}
	public double AreaTetaedroRegular() {
		AreaTetaedroRegular=((int)(Math.pow(show_lado(),2)))*((Math.sqrt(3)));
		return AreaTetaedroRegular;
	}
	public double VolumenTetaedroRegular() {
		VolumenTetaedroRegular=(((int)(Math.pow(show_lado(),3)))*((Math.sqrt(2))))/12;
		return VolumenTetaedroRegular;
	}
	public double AreaEsfera() {
		AreaEsfera=4*Math.PI*(int)(Math.pow(show_radio01(),2));
		return AreaEsfera;
	}
	public double VolumenEsfera() {
		VolumenEsfera=(4*Math.PI*(int)(Math.pow(show_radio01(),3)))/3;
		return VolumenEsfera;
	}
	public double AreaOctaedroRegular() {
		AreaOctaedroRegular=(((int)(Math.pow(show_lado(),2)))*((Math.sqrt(3))))*2;
		return AreaOctaedroRegular;
	}
	public double VolumenOctaedroRegular() {
		VolumenOctaedroRegular=(((int)(Math.pow(show_lado(),3)))*((Math.sqrt(2))))/3;
		return VolumenOctaedroRegular;
	}
	public double AreaHuso() {
		AreaHuso=((4*Math.PI*(int)(Math.pow(show_radio01(),2)))/360)*show_angulo();
		return AreaHuso;
	}
	public double VolumenHuso() {
		VolumenHuso=((((Math.PI*(int)(Math.pow(show_radio01(),3)))/360)*4)/3)*show_angulo();
		return VolumenHuso;
	}
	public double apotemaPiramide() {
		apotemaPiramide=(int)(Math.sqrt(((int)Math.pow(show_altura(), 2)+((int)Math.pow(apotema, 2)))));
		return apotemaPiramide;
	}
	public double AreaPiramideRegular() {
		AreaPiramideRegular=((perimetro)/2)*(apotema+apotemaPiramide);
		return AreaPiramideRegular;
	}
	public double VolumenPiramideRegular() {
		VolumenPiramideRegular=(AreaPiramideRegular*show_altura())/3;
		return VolumenPiramideRegular;
	}
	public double AreaCasqueteEsferico() {
		AreaCasqueteEsferico=(2*Math.PI*show_radio01())*show_altura();
		return AreaCasqueteEsferico;
	}
	public double VolumenCasqueteEsferico() {
		VolumenCasqueteEsferico=((Math.PI*Math.pow(show_altura(), 2))/3)*(3*show_radio01()-show_altura());
		return VolumenCasqueteEsferico;
	}
	public double AreaZonaEsferica() {
		AreaZonaEsferica=(2*Math.PI*show_radio01())*show_altura();
		return AreaZonaEsferica;
	}
	public double VolumenZonaEsferica() {
		VolumenZonaEsferica=((Math.PI*show_altura())/6)*((int)(Math.pow(show_altura(), 2))+(3*(int)(Math.pow(show_radio01(), 2)))+(3*(int)(Math.pow(show_radio02(), 2))));
		return VolumenZonaEsferica;
	}
}	