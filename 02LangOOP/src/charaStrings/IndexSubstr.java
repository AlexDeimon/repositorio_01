package charaStrings;

public class IndexSubstr {

	public static void main(String[] args) {
		String s="Un buen libro de Algoritmos, un buen material";
		int pos1=s.indexOf("buen");
		int pos2=s.lastIndexOf("buen");
		System.out.println(pos1);
		System.out.println(pos2);
	}
}