package String1;

public class ComboString {
	public static String comboString(String a, String b) {
		  int lenA = a.length();
		  int lenB = b.length();
		  if (lenA > lenB)
		    return b+a+b;
		  else
		    return a+b+a;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComboString comboString=new ComboString();
		System.out.println(ComboString.comboString("Hello","hi"));
		System.out.println(ComboString.comboString("Hi","hello"));

		System.out.println(ComboString.comboString("aaa","b"));


	}

}
