package String1;

public class Without {
	public static String withoutEnd(String str) {
		  int len = str.length();
		  return str.substring(1,len - 1);
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Without withoutEnd=new Without();
		System.out.println(Without.withoutEnd("Hello"));
		System.out.println(Without.withoutEnd("java"));
		System.out.println(Without.withoutEnd("coding"));
		

	}

}
