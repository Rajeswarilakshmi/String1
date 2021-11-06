package String1;

public class Atfirst {
	public static String atFirst(String str) {

		  if (str.length() >= 2)
			  return str.substring(0,2);
		  else if (str.length() == 1)
		    return str + "@";
		  else
		    return "@@";
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atfirst atFirst=new Atfirst();
		System.out.println(Atfirst.atFirst("hello"));
		System.out.println(Atfirst.atFirst("hi"));
		System.out.println(Atfirst.atFirst("h"));

		

	}

}
