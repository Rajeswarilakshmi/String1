package String1;

public class Mincat {
	public static  String minCat(String a, String b) {
		  if (a.length() == b.length())
		    return a+b;
		  if (a.length() > b.length()){
		    int diff = a.length() - b.length();
		    return a.substring(diff, a.length()) + b;
		  } else {
		    int diff = b.length() - a.length();
		    return a + b.substring(diff, b.length());
		  }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mincat minCat=new Mincat();
		System.out.println(Mincat.minCat("Hello", "Hi"));
		System.out.println(Mincat.minCat("Hello", "java"));

		System.out.println(Mincat.minCat("java","Hello"));


	}

}
