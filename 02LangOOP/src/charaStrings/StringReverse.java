package charaStrings;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(invertedString("EnCadenaDos"));
	}
	
	public static String invertedString(String s) {
		int ls=s.length();
		StringBuilder t=new StringBuilder(ls);
		for(int i=(ls-1); i>=0; i--)
			t.append(s.charAt(i));
		return(t.toString());
	}
}