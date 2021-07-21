package Grades;

class CConvGrade {
	private int CG_Fahr;
	static int x=1;
	public void mtd_AssiFahr(int pw_Fahr) {		// Metodo setter
		CG_Fahr=pw_Fahr;
	}
	public float mtd_CalcCent() {
		return (float)(5F/9F)*(CG_Fahr-32);		
	}
	public int mtd_ShowFahr() {				// Metodo getter
		return CG_Fahr;
	}
	public void mtd_Showx() {
		System.out.println("El valor de x es: "+x);
	}
}
