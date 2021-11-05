package String1;

public class NonStart {
	public  static String nonStart(String a, String b) {
		  return a.substring(1,a.length()) + b.substring(1,b.length());
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStart nonStart=new NonStart();
		System.out.println(NonStart.nonStart("Hello", "There"));
		System.out.println(NonStart.nonStart("java", "code"));
		System.out.println(NonStart.nonStart("shotl", "java"));

	}

}
