package String1;

public class Left2 {
	public  static String left2(String str) {
		  return str.substring(2, str.length()) + str.substring(0,2);
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Left2 left2=new Left2();
		System.out.println(Left2.left2("Hello"));
		System.out.println(Left2.left2("java"));
		System.out.println(Left2.left2("Hi"));

	}

}
