package String1;

public class FrontAgain {
	public static boolean frontAgain(String str) {
		  if (str.length() < 2)
		    return false;
		  else if (str.substring(0,2).equals
				  (str.substring(str.length()-2, str.length())))
		    return true;
		  else
		    return false;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrontAgain frontAgain=new FrontAgain();
		System.out.println(FrontAgain.frontAgain("edited"));
		System.out.println(FrontAgain.frontAgain("edit"));
		System.out.println(FrontAgain.frontAgain("ed"));


	}

}
