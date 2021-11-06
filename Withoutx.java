package String1;

public class Withoutx {
	public static String withoutX(String str) { 
		  if (str.length() == 0)
		    return str;
		  if (str.length() == 1){
		    if (str.charAt(0) == 'x')

		      return "";
		    else
		      return str;
		  }
		  if (str.charAt(0) == 'x')
		    str = str.substring(1,str.length());
		  if (str.charAt(str.length()-1) == 'x')
		    str = str.substring(0,str.length()-1);
		  return str;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Withoutx withoutX=new Withoutx();
		System.out.println(Withoutx.withoutX("xHix"));
		System.out.println(Withoutx.withoutX("xHi"));
		System.out.println(Withoutx.withoutX("Hxix"));


	}

}
