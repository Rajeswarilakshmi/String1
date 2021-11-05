package String1;

public class End {
	public  static boolean endsLy(String str) {
	  int len = str.length();
	  String ly = "ly";
	  if (len < 2)
	    return false;
	  else if (ly.equals(str.substring(len-2,len)))
	    return true;
	  else
	    return false;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		End endsLy=new End();
		System.out.println(End.endsLy("oddly") );
		System.out.println(End.endsLy("y") );
		System.out.println(End.endsLy("oddy") );

	}

}
