package String1;

public class Withoutx2 {
	public static String withoutX2(String str) {
		  String temp = "";
		  for (int i = 0; i < str.length(); i++) {
		    if (i == 0 && str.charAt(i) != 'x')
		      temp += str.charAt(i);
		    else if (i == 1 && str.charAt(i) != 'x')

		      temp += str.charAt(i);
		    else if (i > 1)
		      temp += str.charAt(i);
		  }
		  return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Withoutx2 withoutX2=new Withoutx2();
		System.out.println(Withoutx2.withoutX2("xHi"));
		System.out.println(Withoutx2.withoutX2("Hxi"));
		System.out.println(Withoutx2.withoutX2("Hi"));


	}

}
