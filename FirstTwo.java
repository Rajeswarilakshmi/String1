package String1;

public class FirstTwo {
	public  static String firstTwo(String str) {
		  int len = str.length();
		  if (len < 2)
		    return str;
		  else
		    return str.substring(0,2);
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstTwo firstTwo=new FirstTwo();
		System.out.println(FirstTwo.firstTwo("Hello"));
		System.out.println(FirstTwo.firstTwo("abcdefg"));
		System.out.println(FirstTwo.firstTwo("ab"));

	}

}
