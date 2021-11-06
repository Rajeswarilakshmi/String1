package String1;

public class Without2 {
	public static String without2(String str) {
		  int len = str.length();
		  if (len == 2)
		    return "";
		  if (len < 2)
		    return str;
		  else {
		    if (str.substring(0,2).equals(str.substring(len-2, len)))
		      return str.substring(2,len);
		      else return str;
		  }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Without2 without2=new Without2();
		System.out.println(Without2.without2("HelloHe"));
		System.out.println(Without2.without2("HelloHi"));
		System.out.println(Without2.without2("Hi"));


	}

}
