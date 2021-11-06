package String1;

public class Right2 {
	public  static String right2(String str) {
		
		  return str.substring(str.length()-2, str.length()) 
				  + str.substring(0,str.length()-2);
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Right2 right2=new Right2();
		System.out.println(Right2.right2("Hello"));
		System.out.println(Right2.right2("java"));
		System.out.println(Right2.right2("Hii"));

	}

}
