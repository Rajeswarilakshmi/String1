package String1;

public class TheEnd {
	public  static String theEnd(String str, boolean front) {
		  if (front)
		    return str.substring(0,1);
		  else
		    return str.substring(str.length()-1);
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheEnd theEnd=new TheEnd();
		System.out.println(TheEnd.theEnd("Hello", true));
		System.out.println(TheEnd.theEnd("Hello", false));
		System.out.println(TheEnd.theEnd("oh", true));
	}

}
