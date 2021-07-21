package Grades;

public class CTestGrade{
	final static int LIMI = 0;
	final static int LIMS = 50;
	final static int RANG = 5;
	public static void main(String[] args) {
	float w_Cent=0.0F;
	CConvGrade ConveGrade = new CConvGrade();
		/*
		int R;
		ConveGrade.mtd_Showx();
		R=ConveGrade.mtd_ShowFahr();
		System.out.println("el valor de fahr es "+R);
		CConvGrade ConveGrade2 = new CConvGrade();
		R=ConveGrade.mtd_ShowFahr();
			System.out.println("el valor de fahr es "+R);
*/	
		System.out.println("G.Fahr\tG.Cent");
		int w_Fahr=LIMI;
		while(w_Fahr<(LIMS+1)) {
			ConveGrade.mtd_AssiFahr(w_Fahr);
			w_Cent=ConveGrade.mtd_CalcCent();
			System.out.println(w_Fahr+"\t"+w_Cent+"\t");
			w_Fahr+=RANG;
		}
	}	
}
// Elaborar una clase que convierta de Centígrados a Fahr
// permitiendo que se pueda seleccionar entre una conversión o la otra
