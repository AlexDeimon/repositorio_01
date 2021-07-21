package charaStrings;

public class IndexAddress {

	public static void main(String[] args) {
		String s="Esto Es Una Cadena de CaRACTeres";
		int pos1=s.indexOf("C");
		int pos2=s.lastIndexOf('C');
		int pos3=s.indexOf('x');
		System.out.println(
				"La C está en primera instancia en "+pos1);
		System.out.println(
				"La C está de última en la posición "+pos2);
		System.out.println(
				"La x está en la posición "+pos3);
	}
}
