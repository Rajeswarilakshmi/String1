package String1;

public class Lasttwo {
	public static String lastTwo(String str) {
		  if (str.length() < 2)
		    return str;
		  else
		    return str.substring(0, str.length()-2) + 
		    		str.charAt(str.length()-1) + str.charAt(str.length()-2);
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lasttwo lastTwo=new Lasttwo();
		System.out.println(Lasttwo.lastTwo("coding"));
		System.out.println(Lasttwo.lastTwo("cat"));
		System.out.println(Lasttwo.lastTwo("ab"));


	}

}
