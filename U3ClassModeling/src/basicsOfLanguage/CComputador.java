package basicsOfLanguage;

public class CComputador {
	//Alternate: private Com_Marca
//				 public Com_Marca
	String Com_Marca; 
	String Com_Processor; 
	static byte Com_Tipo_Proc; 	//Tipo de procesamiento, en orden de complejidad
								//1=lineal, 2=paralelo, 3=Simétrico
	public static void main(String[] args) {
		Com_Tipo_Proc=1;
		if (Com_Tipo_Proc==1) {
			System.out.println("Procesamiento lineal");
		} else if(Com_Tipo_Proc==2){
			System.out.println("Procesamiento paralelo");
		} else {
			System.out.println("Procesamiento Simétrico");
		}
		CComputador Computador01 =new CComputador(); 
		System.out.println(Com_Tipo_Proc);
		Computador01.Com_Marca="DELL"; 
		System.out.println(Computador01.Com_Marca);
		Computador01.Com_Tipo_Proc=2; 
		System.out.println(Computador01.Com_Tipo_Proc);
		CComputador computador02 =new CComputador(); 
		computador02.Com_Marca="LENOVO"; 
		System.out.println(computador02.Com_Marca);
		System.out.println(computador02.Com_Tipo_Proc);
	}
}