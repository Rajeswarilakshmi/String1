package String1;

public class WithOutend {
	public  static String withouEnd2(String str) {
	  int len = str.length();
	  if (len < 3)
	    return "";
	
	  else

	    return str.substring(1,str.length()-1);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithOutend withoutEnd2=new WithOutend();
		System.out.println(WithOutend.withouEnd2("Hello"));
		System.out.println(WithOutend.withouEnd2("abc"));
		System.out.println(WithOutend.withouEnd2("ab"));

	}

}
