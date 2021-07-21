package charaStrings;

public class StartEndSubstr {

	public static void main(String[] args) {
		String s="Un buen libro de Algoritmos";
		boolean b1=s.startsWith("Un buen libro");
		boolean b2=s.startsWith("A");
		boolean b3=s.endsWith("Algoritmos");
		boolean b4=s.endsWith("Chau");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
	}
}
