package String1;

public class ExtraFront {
	public  static String extraFront(String str) {
		  if (str.length() < 2)
		    return str + str + str;
		  else {
		    String newString = str.substring(0,2);
		    return newString + newString + newString;
		  }
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtraFront extraFront=new ExtraFront();
		System.out.println(ExtraFront.extraFront("Hello"));
		System.out.println(ExtraFront.extraFront("ab"));

		System.out.println(ExtraFront.extraFront("H"));


	}

}
