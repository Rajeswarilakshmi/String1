package String1;

public class ExtraEnd {
	public static  String extraEnd(String str) {
		  String s = str.substring(str.length()-2, str.length());
		  return s+s+s;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtraEnd extraEnd=new ExtraEnd();
		System.out.println(ExtraEnd.extraEnd("Hello"));
		System.out.println(ExtraEnd.extraEnd("ab"));
		System.out.println(ExtraEnd.extraEnd("Hi"));

	}

}
