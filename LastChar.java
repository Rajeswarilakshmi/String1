package String1;

public class LastChar {
	public  static String lastChars(String a, String b) {
		  if(a.length() == 0)
		    a = "@";
		  if(b.length() == 0)
		    b = "@";
		  return a.substring(0,1) + b.substring(b.length()-1, b.length());
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LastChar lastchar=new LastChar();
		System.out.println(LastChar.lastChars("last", "chars"));
		System.out.println(LastChar.lastChars("yo", "java"));
		System.out.println(LastChar.lastChars("hi", ""));

	}

}
