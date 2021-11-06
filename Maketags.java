package String1;

public class Maketags {
	public static String makeTags(String tag, String word) {
	  return "<"+tag+">"+word+"</"+tag+">";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maketags makeTags=new Maketags();
		System.out.println(Maketags.makeTags("i", "yay"));
		System.out.println(Maketags.makeTags("i", "Hello"));

		System.out.println(Maketags.makeTags("cite", "yay"));


	}

}
