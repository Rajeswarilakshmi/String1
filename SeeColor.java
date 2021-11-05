package String1;

public class SeeColor {
	public  static String seeColor(String str) {
		  if (str.startsWith("red"))
		    return "red";
		  if (str.startsWith("blue"))
		    return "blue";
		  else
		    return "";
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeeColor seeColor=new SeeColor();
		System.out.println(SeeColor.seeColor("redxx"));
		System.out.println(SeeColor.seeColor("xxred") );
		System.out.println(SeeColor.seeColor("blueTimes") );

	}

}
